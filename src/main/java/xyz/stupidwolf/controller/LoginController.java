package xyz.stupidwolf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.stupidwolf.domain.User;
import xyz.stupidwolf.exception.UserCheckFailException;
import xyz.stupidwolf.exception.UserNotFoundException;
import xyz.stupidwolf.service.IUserService;

import javax.servlet.http.HttpSession;

/**
 * 登录控制
 * Created by stupidwolf on 2016/8/3.
 */
@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private IUserService userService;

    /**
     * 提供用户名认证，email认证
     * @param loginName 登录名
     * @param password 登录密码
     * @param session session
     * @return 若成功，则首页，否则登录界面
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String loginName, String password, Integer roleId, HttpSession session) {
        if (loginName == null || loginName.equals("")|| password == null||password.equals("")) {
            logger.info("用户名或密码为空.");
            return "forward:/login";
        }
        User user = null;
        //用户名方式检验
        try {
            user = userService.loginByName(loginName, password, roleId);
            session.setAttribute("user", user);
            return "redirect:/u/" + user.getId()+ "/home";

        } catch (UserNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (UserCheckFailException e2) {
            System.out.println(e2.getMessage());
        }

        //email方式检验
        try {
            user = userService.loginByEmail(loginName, password, roleId);
            session.setAttribute("user", user);
            return "redirect:/u/" + user.getId() + "/home";
        }catch (UserNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (UserCheckFailException e2) {
            System.out.println(e2.getMessage());
        }
            return "forward:/login";

    }
}
