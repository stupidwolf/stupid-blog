package xyz.stupidwolf.service;

import xyz.stupidwolf.domain.Blog;

import java.util.List;

public interface IBlogService {
    boolean insert(Blog blog);
    boolean delete(long id);
    boolean update(Blog blog);
    Blog findBlogById(long id);
    List<Blog> findAllBlogs(long userId, int offset, int limit);
}
