package xyz.stupidwolf.service;

import xyz.stupidwolf.domain.User;
import xyz.stupidwolf.exception.UserCheckFailException;
import xyz.stupidwolf.exception.UserNotFoundException;

/**
 * Created by stupidwolf on 2016/7/30.
 */
public interface IUserService {
    User loginByName(String userName, String password, int roleId) throws UserNotFoundException, UserCheckFailException;

    User loginByEmail(String email, String password, int roleId) throws UserNotFoundException, UserCheckFailException;

    boolean insert(User user);
    boolean update(User user);
    boolean deleteLogically(User user);
}
