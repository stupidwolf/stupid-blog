package xyz.stupidwolf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.stupidwolf.domain.Type;
import xyz.stupidwolf.exception.CanNotGetBlogListException;
import xyz.stupidwolf.service.IBlogTypeService;

import java.util.List;

/**
 *
 * Created by stupidwolf on 2016/8/6.
 */
@Controller
public class BlogController {
    private static Logger logger = LoggerFactory.getLogger(BlogController.class);
    @Autowired
    private IBlogTypeService blogTypeService;
    @RequestMapping(value = "/blog/type/list")
    public @ResponseBody List<Type> getTypeList() {
        List<Type> types = null;
        try {
            types = blogTypeService.getTypeList();
        }catch (CanNotGetBlogListException e) {
            logger.warn(e.getMessage());
        }
        return types;
    }
}
