package xyz.stupidwolf.dao;

import xyz.stupidwolf.domain.Type;

import java.util.List;

/**
 * type
 * Created by stupidwolf on 2016/8/6.
 */
public interface BlogTypeDao {
    /**
     * 查找所有的博客类型
     * @return
     */
    List<Type> findAllTypes();

}
