package xyz.stupidwolf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.stupidwolf.dao.UserDao;
import xyz.stupidwolf.domain.User;
import xyz.stupidwolf.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User loginByName(String userName, String password) {
        User user = userDao.findUserByUserName(userName);
        if (userName.equals(user.getName()) && password.equals(user.getPassword()))
              return user;
        else
            return null;
    }

    @Override
    public User loginByEmail(String email) {
        return null;
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
