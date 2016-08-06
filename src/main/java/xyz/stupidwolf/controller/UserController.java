package xyz.stupidwolf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import xyz.stupidwolf.domain.Blog;
import xyz.stupidwolf.domain.Resource;
import xyz.stupidwolf.domain.User;
import xyz.stupidwolf.dto.BlogPage;
import xyz.stupidwolf.enums.ResultCode;
import xyz.stupidwolf.exception.BlogInsertFailException;
import xyz.stupidwolf.exception.BlogNotFoundException;
import xyz.stupidwolf.exception.DeletePermissionDenyException;
import xyz.stupidwolf.exception.NoLoginException;
import xyz.stupidwolf.service.IBlogService;
import xyz.stupidwolf.service.IUserService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/u")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService userService;
    @Autowired
    private IBlogService blogService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 获得个人的所有博客列表
     * @param current
     * @param size
     * @return
     */
    @RequestMapping(value = "/{userId}/blog/getList", method = RequestMethod.GET)
    public @ResponseBody BlogPage getBlogList(@PathVariable Long userId, Integer current, Integer size) {
        if (current == null) {
           current = 1;
        }
        if (size == null) {
            size = 4;
        }

        BlogPage blogPage = null;
        try {
           blogPage = blogService.getBlogPage(userId, current, size);
        } catch (BlogNotFoundException e) {
            logger.info(e.getMessage());
        }
        return blogPage;
    }

    @RequestMapping(value = "/blog/list", method = RequestMethod.GET)
    public String listBlogs() {
        return "listBlogs";
    }

    @RequestMapping(value = "/blog/view/{id}", method = RequestMethod.GET)
    public String  viewBlog(@PathVariable Long id, Model model) {
        try {
            Blog blog = blogService.findBlogById(id);
            model.addAttribute("blog", blog);
        } catch (BlogNotFoundException e) {
            logger.info(e.getMessage());
        }
        return "viewBlog";
    }


    @RequestMapping(value = "/blog/delete", method = RequestMethod.DELETE)
    public @ResponseBody String deleteBlog(Long id, HttpSession session) {
        if (id == null) {
            logger.info("执行删除错误，blog id 不能为空");
            return ResultCode.DELETE_FAIL.getCode();
        }
        User user = (User) session.getAttribute("user");
        try {
            blogService.delete(user.getId(), id);
        } catch (DeletePermissionDenyException e) {
            logger.info(e.getMessage());
            return ResultCode.DELETE_FAIL.getCode();
        }
        return ResultCode.DELETE_SUCCESS.getCode();
    }

    @RequestMapping(value = "/blog/write")
    public String writrBlog() {
        return "write";
    }

    @RequestMapping(value = "/blog/do_write", method = RequestMethod.POST)
    public @ResponseBody String doWriteBlog(@Valid @ModelAttribute("blog") Blog blog,
                                            HttpSession session , Errors errors) {

        System.out.println(blog.getTitle());
        System.out.println(blog.getSummary());
        System.out.println(blog.getContent());
        System.out.println(blog.getType().getId());
        int typeId = blog.getType().getId();
        if (errors.hasErrors()) {
            logger.warn("数据认证不通过.");
            return ResultCode.WRITE_FAIL.getCode();
        }

//        User user = (User)session.getAttribute("user");
//        if (user == null) {
//            throw new NoLoginException("用户未登录");
//        }

        long userId = 2;

        try{
            blogService.add(blog, userId, typeId);
        } catch (BlogInsertFailException e) {
            logger.warn(e.getMessage());
            return ResultCode.WRITE_FAIL.getCode();
        }
        return ResultCode.WRITE_SUCCESS.getCode();
    }

}
