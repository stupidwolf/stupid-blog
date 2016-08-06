package xyz.stupidwolf.service;

import xyz.stupidwolf.domain.Resource;

import java.util.List;

/**
 * 资源管理
 * Created by stupidwolf on 2016/8/4.
 */
public interface IResoureService {
    List<Resource> getResourceList(int roleId);
}
