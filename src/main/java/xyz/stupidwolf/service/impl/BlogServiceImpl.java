package xyz.stupidwolf.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttribute;
import xyz.stupidwolf.dao.BlogDao;
import xyz.stupidwolf.domain.Blog;
import xyz.stupidwolf.domain.Type;
import xyz.stupidwolf.domain.User;
import xyz.stupidwolf.dto.BlogPage;
import xyz.stupidwolf.exception.BlogInsertFailException;
import xyz.stupidwolf.exception.BlogNotFoundException;
import xyz.stupidwolf.exception.DeletePermissionDenyException;
import xyz.stupidwolf.service.IBlogService;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private BlogDao blogDao;
    private static Logger log = LoggerFactory.getLogger(BlogServiceImpl.class);


    /**
     * 删除Blog
     * @param id 需要被删除的blog id
     * @return 若删除成功，则返回true,失败则false
     */
    @Transactional
    @Override
    public boolean delete(long userId, long id) throws DeletePermissionDenyException{
//        HttpSession session = SessionAttribute.
        Blog blog = blogDao.findBlogById(id);
        if (blog.getUser().getId() != userId) {
            log.info("登录账号id与博文作者id不一致，抛出异常.");
            throw new DeletePermissionDenyException("你没有权限删除 blog: " + blog.getId());
        }

        int result = blogDao.deleteBlogById(id);
        return result > 0 ? true :  false;
    }

    /**
     *
     * @param blog 更改的blog
     * @return 若更新成功，则返回true,失败则为false
     */
    @Override
    public boolean update(Blog blog) {
        int result = blogDao.updateBlogWithType(blog);
        return result > 0 ? true :  false;
    }

    @Transactional
    @Override
    public boolean add(Blog blog, long userId, int typeId) {
        Type type = new Type();
        type.setId(typeId);
        User user = new User();
        user.setId(userId);
        Date date = new Date();

        blog.setType(type);
        blog.setUser(user);

        //新添加时，二者值相等
        blog.setCreateTime(date);
        blog.setLastModifyTime(date);

        if (blogDao.insertBlogWithTypeAndUser(blog) <= 0) {
            throw new BlogInsertFailException("添加博客失败.");
        }
        return true;
    }

    /**
     * 通过id查看blog
     * @param id id
     * @exception BlogNotFoundException 未找到 id 对应的blog
     * @return 若找到Blog则返回具体数据，否则，返回Null
     */
    @Override
    public Blog findBlogById(long id) throws BlogNotFoundException{
        Blog blog = blogDao.findBlogById(id);
        if (blog == null)
            throw new BlogNotFoundException("未找到id: " + id + " 的博文");
        return blog;
    }

    /**
     * 分页查看具体用户的blog列表
     * @param userId userId
     * @param current 当前页
     * @param size 每页条数
     * @exception BlogNotFoundException 未查询到具体的博客异常
     * @return Blog List
     */
    @Override
    public BlogPage getBlogPage(long userId, int current, int size) throws BlogNotFoundException{
        int count = blogDao.count(userId);
        BlogPage blogPage = new BlogPage(current, size);
        blogPage.setCount(count);
        blogPage.setCurrent(current);
        List<Blog> blogs = blogDao.findAllBlogs(userId, blogPage.getStart(), blogPage.getSize());

        blogPage.setBlogs(blogs);

        return blogPage;
    }


    /**
     * 获得某个用户所有博客的数量
     * @param id user id
     * @return 博客的总数量
     */
    @Override
    public int count(long id) {
        return blogDao.count(id);
    }


}
