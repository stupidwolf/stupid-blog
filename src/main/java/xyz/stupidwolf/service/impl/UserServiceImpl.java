package xyz.stupidwolf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.stupidwolf.dao.ResourceDao;
import xyz.stupidwolf.dao.RoleDao;
import xyz.stupidwolf.dao.UserDao;
import xyz.stupidwolf.domain.User;
import xyz.stupidwolf.exception.UserCheckFailException;
import xyz.stupidwolf.exception.UserNotFoundException;
import xyz.stupidwolf.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private ResourceDao resourceDao;

    @Autowired
    private RoleDao roleDao;

    @Override
    public User loginByName(String userName, String password, int roleId) throws UserNotFoundException, UserCheckFailException{
        User user = userDao.findUserByUserName(userName, roleId);
        if (user == null)
           throw new UserNotFoundException("name: 未能找到用户异常.");

        if (userName.equals(user.getName()) && password.equals(user.getPassword()))
              return user;

        throw new UserCheckFailException("name: 身份验证未通过.");
    }

    @Override
    public User loginByEmail(String email, String password, int roleId) throws UserNotFoundException, UserCheckFailException{
        User user = userDao.findUserByEmail(email, roleId);
        if (user == null)
            throw new UserNotFoundException("email方式: 用户未找到异常.");

        if (user.getEmail().equals(email) && user.getPassword().equals(password))
            return user;

        throw new UserCheckFailException("email方式: 用户验证未通过");
    }

    @Override
    public boolean insert(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean deleteLogically(User user) {
        return false;
    }


}
