package xyz.stupidwolf.service;

import xyz.stupidwolf.domain.Type;
import xyz.stupidwolf.exception.CanNotGetBlogListException;

import java.util.List;

/**
 * Created by stupidwolf on 2016/8/6.
 */
public interface IBlogTypeService {
    List<Type> getTypeList() throws CanNotGetBlogListException;
}
