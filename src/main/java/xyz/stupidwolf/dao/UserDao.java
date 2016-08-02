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
     * 查询所有用户以及所属类型信息
     * @return
     */
    List<User> findAllUsersWithRole();

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
     * @return
     */
    User findUserById(long id);

    /**
     *通过用户名查找用户
     * @param userName
     * @return
     */
    User findUserByUserName(String userName);

    /**
     *通过Email查找用户
     * @param email
     * @return
     */
    User findUserByEmail(String email);
}
