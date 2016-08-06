package xyz.stupidwolf.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import xyz.stupidwolf.domain.Role;
import xyz.stupidwolf.domain.User;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 增加新用户
     * @param user
     * @return
     */
    int insertUserWithRole(User user);

    /**
     *
     * @param user
     * @return
     */
    int updateUserWithRole(User user);

    /**
     * 逻辑删除用户,并删除其所拥有的角色信息
     * @param id
     * @return
     */
    int deleteUserWith(long id);

    /**
     * 通过 user id 查找用户
     * @param userId user id
     * @return 返回带有角色类型列表的用户
     */
    User findUserWithRoles(long userId);

    /**
     * 分页查询用户信息
     * @param offset
     * @param limit
     * @return
     */
    List<User> queryUsersWithRole(long userId, @Param("offset") int offset, @Param("limit") int limit);
    /**
     * 查找某一角色的所有用户
     * @param roleId
     * @return
     */
    List<User> findUsersByRole(int roleId);

    /**
     * 通过id查询用户
     * @param id
     * @return user
     */
    User findUserById(long id);

    /**
     *通过用户名查找用户
     * @param name
     * @param roleId role id
     * @return user with role
     */
    User findUserByUserName(@Param("name") String name, @Param("roleId") int roleId);

    /**
     *通过Email查找用户
     * @param email
     * @param roleId role id
     * @return user with role
     */
    User findUserByEmail(@Param("email") String email, @Param("roleId") int roleId);
}
