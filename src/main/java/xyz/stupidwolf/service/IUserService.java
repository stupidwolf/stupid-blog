package xyz.stupidwolf.service;

import xyz.stupidwolf.domain.User;

/**
 * Created by stupidwolf on 2016/7/30.
 */
public interface IUserService {
    User loginByName(String userName, String password);

    User loginByEmail(String email);

    boolean insert(User user);
    boolean update(User user);
    boolean deleteLogically(User user);

}
