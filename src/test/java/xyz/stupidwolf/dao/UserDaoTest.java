package xyz.stupidwolf.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.stupidwolf.domain.User;

import static org.junit.Assert.*;

/**
 * Created by stupidwolf on 2016/8/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void insertUserWithRole() throws Exception {

    }

    @Test
    public void updateUserWithRole() throws Exception {

    }

    @Test
    public void deleteUserWith() throws Exception {

    }

    @Test
    public void findAllUsersWithRole() throws Exception {

    }

    @Test
    public void queryUsersWithRole() throws Exception {

    }

    @Test
    public void findUsersByRole() throws Exception {

    }

    @Test
    public void findUserById() throws Exception {

    }

    @Test
    public void findUserByUserName() throws Exception {
        String userName = "cml";
        User user = userDao.findUserByUserName(userName);
        System.out.println(user);
    }

    @Test
    public void findUserByEmail() throws Exception {

    }

}