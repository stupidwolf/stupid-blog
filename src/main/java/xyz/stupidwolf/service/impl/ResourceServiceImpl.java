package xyz.stupidwolf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.stupidwolf.dao.ResourceDao;
import xyz.stupidwolf.domain.Resource;
import xyz.stupidwolf.service.IResoureService;

import java.util.List;

/**
 * Created by stupidwolf on 2016/8/4.
 */
@Service
public class ResourceServiceImpl implements IResoureService {
    @Autowired
    private ResourceDao resourceDao;

    @Override
    public List<Resource> getResourceList(int roleId) {
        return resourceDao.findResourceByRole(roleId);
    }
}
