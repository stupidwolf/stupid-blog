package xyz.stupidwolf.service;

import org.springframework.transaction.annotation.Transactional;
import xyz.stupidwolf.domain.Blog;
import xyz.stupidwolf.dto.BlogPage;
import xyz.stupidwolf.exception.BlogNotFoundException;
import xyz.stupidwolf.exception.BlogUpdateException;
import xyz.stupidwolf.exception.DeletePermissionDenyException;

import java.util.List;

public interface IBlogService {
    /**
     * 根据博客id删除博客
     * @param userId user id 用来检查一致性
     * @param id blog id
     * @return 操作成功与否
     * @throws DeletePermissionDenyException 没权限删除异常
     */
    boolean delete(long userId, long id) throws DeletePermissionDenyException;

    /**
     * 添加新博客
     * @param blog blog对象
     * @param userId 用户 id
     * @param typeId 类型 id
     * @return 是否添加成功
     */
    boolean add(Blog blog, long userId, int typeId);

    /**
     *
     * @param blog
     * @return 更新操作结果
     */
    boolean update(Blog blog) throws BlogUpdateException;


    Blog findBlogById(long id) throws BlogNotFoundException;

    /**
     * 分页获得用户的博客列表
     * @param userId user id
     * @param current 当前页
     * @param size 每页数据大小
     * @return 封装博客列表的dto对象
     */
    BlogPage getBlogPage(long userId, int current, int size) throws BlogNotFoundException;

    /**
     * 获得 userId 为 id的用户的所博客的条数
     * @param id user id
     * @return 博文总数
     */
    int count(long id);
}
