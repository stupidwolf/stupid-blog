package xyz.stupidwolf.dao;

import xyz.stupidwolf.domain.Resource;

import java.util.List;

/**
 * Created by stupidwolf on 2016/8/3.
 */
public interface ResourceDao {
    /**
     * 根据角色id来查找
     * @param roleId role id
     * @return
     */
    List<Resource> findResourceByRole(int roleId);
}
