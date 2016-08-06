package xyz.stupidwolf.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.stupidwolf.domain.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by stupidwolf on 2016/8/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class ResourceDaoTest {
    @Autowired
    private ResourceDao resourceDao;
    @Test
    public void findAllResourceByUserId() throws Exception {
        int id = 1;
        List<Resource> list = resourceDao.findResourceByRole(id);
        for (Resource r: list ) {
            System.out.println(r.getContent() + " " + r.getUrl());

        }
    }

}