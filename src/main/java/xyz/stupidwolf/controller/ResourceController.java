package xyz.stupidwolf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.stupidwolf.domain.Resource;
import xyz.stupidwolf.service.IResoureService;

import java.util.List;

/**
 * 管理角色的资源请求
 * Created by stupidwolf on 2016/8/4.
 */
@Controller
@RequestMapping("/rs")
public class ResourceController {
    private static Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    private IResoureService resoureService;
    @RequestMapping(value = "/{roleId}/menu", method = RequestMethod.GET)
    public @ResponseBody List<Resource> getResource(@PathVariable Integer roleId) {
        logger.info("get menu resource running.");
        List<Resource> resourceList = resoureService.getResourceList(roleId);

        return  resourceList;
    }
}
