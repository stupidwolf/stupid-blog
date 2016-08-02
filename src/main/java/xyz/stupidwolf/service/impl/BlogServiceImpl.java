package xyz.stupidwolf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.stupidwolf.dao.BlogDao;
import xyz.stupidwolf.domain.Blog;
import xyz.stupidwolf.service.IBlogService;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private BlogDao blogDao;

    /**
     * 插入Blog
     * @param blog blog
     * @return 若插入成功，则返回true,失败则false;
     */
    @Override
    public boolean insert(Blog blog) {
        int result = blogDao.insertBlogWithTypeAndUser(blog);
        return result > 0 ? true :  false;
    }

    /**
     * 删除Blog
     * @param id 需要被删除的blog id
     * @return 若删除成功，则返回true,失败则false
     */
    @Override
    public boolean delete(long id) {
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

    /**
     * 通过id查看blog
     * @param id id
     * @return 若找到Blog则返回具体数据，否则，返回Null
     */
    @Override
    public Blog findBlogById(long id) {
        Blog blog = blogDao.findBlogById(id);
        return blog;
    }

    /**
     * 分页查看具体用户的blog列表
     * @param userId userId
     * @param offset 起始索引
     * @param limit 每页条数
     * @return Blog List
     */
    @Override
    public List<Blog> findAllBlogs(long userId, int offset, int limit) {
        List<Blog> blogs = blogDao.findAllBlogs(userId, offset, limit);
        return blogs;
    }
}
