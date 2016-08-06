package xyz.stupidwolf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.stupidwolf.dao.BlogTypeDao;
import xyz.stupidwolf.domain.Type;
import xyz.stupidwolf.exception.CanNotGetBlogListException;
import xyz.stupidwolf.service.IBlogTypeService;

import java.util.List;

/**
 *
 * Created by stupidwolf on 2016/8/6.
 */
@Service
public class BlogTypeServiceImpl implements IBlogTypeService {
    @Autowired
    private BlogTypeDao blogTypeDao;
    @Override
    public List<Type> getTypeList() throws CanNotGetBlogListException {
        List<Type> types = blogTypeDao.findAllTypes();
        if (types == null)
            throw new CanNotGetBlogListException("未找到 blog list");
        return types;
    }
}
