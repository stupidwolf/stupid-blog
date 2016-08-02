package xyz.stupidwolf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.stupidwolf.domain.User;
import xyz.stupidwolf.service.IUserService;

import javax.servlet.http.HttpSession;

/**
 * Created by stupidwolf on 2016/7/30.
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/hello")
    public @ResponseBody String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, HttpSession session) {
        if (user.getName() == null|| user.getPassword() == null) {
            return "forward:/";
        }
        user = userService.loginByName(user.getName(), user.getPassword());
        if (user == null) {
            return "forward:/";
        }
        session.setAttribute("user", user);
        return "index";
    }
}
