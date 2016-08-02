package xyz.stupidwolf.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;
import xyz.stupidwolf.domain.Blog;

import java.util.List;

public interface BlogDao {
    /**
     * 插入博客
     * @param blog 带有类型，用户的Blog对象
     * @return 插入操作的返回结果
     */
    @Transactional
    int insertBlogWithTypeAndUser(Blog blog);

    /**
     * 更新博客
     * @param blog 带有Type的Blog实例
     * @return 更新操作的返回结果
     */
    @Transactional
    int updateBlogWithType(Blog blog);

    /**
     * 删除博客
     * @param id 需要被删除的Blog的Id
     * @return 删除操作的返回结果
     */
    @Transactional
    int deleteBlogById(long id);

    /**
     * 通过id查找博客
     * @param id 博客id
     * @return id所对应的Blog对象
     */
    Blog findBlogById(long id);

    /**
     * 分页查看具体用户的最新博客，默认排序为时间顺序
     * @param userId 需要查询用户id,若为空，则查询所有用户的最新博客
     * @param offset 第一条记录索引
     * @param limit 每次查询的记录条数
     * @return 分页查询到的Blog列表
     */
    List<Blog> findAllBlogs(@Param("userId") Long userId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    //TODO
    List<Blog> findAllBlogsByConditions();
}
