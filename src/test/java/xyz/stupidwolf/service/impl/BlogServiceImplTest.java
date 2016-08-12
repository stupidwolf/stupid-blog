package xyz.stupidwolf.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.stupidwolf.dao.BlogDao;
import xyz.stupidwolf.domain.Blog;
import xyz.stupidwolf.service.IBlogService;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class BlogServiceImplTest {
    @Autowired
    private IBlogService blogService;
    @Test
    public void insert() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void update() throws Exception {
        Blog blog = blogService.findBlogById(3);
        blog.setTitle("Hello");
        blogService.update(blog);
    }

    @Test
    public void add() throws Exception {
        long userId = 2;
        int typeId = 1;
        Blog blog = new Blog();
        blog.setTitle("标题测试");
        blog.setContent("内容测试");
        blog.setSummary("摘要测试");

        blogService.add(blog, userId, typeId);
        System.out.println(blog.getId());
    }

    @Test
    public void findBlogById() throws Exception {

    }

    @Test
    public void getBlogPage() throws Exception {

    }

    @Test
    public void count() throws Exception {

    }

}