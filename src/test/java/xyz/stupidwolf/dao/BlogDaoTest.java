package xyz.stupidwolf.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.stupidwolf.domain.Blog;
import xyz.stupidwolf.domain.Type;
import xyz.stupidwolf.domain.User;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class BlogDaoTest {
    @Autowired
    private BlogDao blogDao;
    @Test
    public void insertBlogWithTypeAndUser() throws Exception {
        User user = new User();
        user.setId(2);
        Type type = new Type();
        type.setId(3);
        Blog blog = new Blog();
        blog.setUser(user);
        blog.setType(type);
        blogDao.insertBlogWithTypeAndUser(blog);
    }

    @Test
    public void updateBlogWithType() throws Exception {
        Type type = new Type();
        type.setId(3);

        Blog blog = blogDao.findBlogById(3);
        blog.setType(type);
        blog.setTitle("有更新哦。");
        blogDao.updateBlogWithType(blog);
    }

    @Test
    public void deleteBlogById() throws Exception {
        long id = 4;
        blogDao.deleteBlogById(4);
    }

    @Test
    public void findBlogById() throws Exception {
        Blog blog = blogDao.findBlogById(2);
        User user = blog.getUser();
        Type type = blog.getType();
    }

    @Test
    public void findAllBlogs() throws Exception {
        List<Blog> blogs = blogDao.findAllBlogs(2l, 1, 5);
    }

    @Test
    public void findAllBlogsByConditions() throws Exception {

    }

}