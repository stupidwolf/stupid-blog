package xyz.stupidwolf.dao;

import xyz.stupidwolf.domain.Role;

import java.util.List;

/**
 * Created by stupidwolf on 2016/8/4.
 */
public interface RoleDao {
    List<Role> findRolesById(int id);
}
