package xyz.stupidwolf.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.stupidwolf.domain.Type;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
public class BlogTypeDaoTest {
    @Autowired
    private BlogTypeDao blogTypeDao;
    @Test
    public void findAllTypes() throws Exception {
        List<Type> types = blogTypeDao.findAllTypes();
        for (Type t: types
             ) {
            System.out.println(t.getId() + " " + t.getName());
        }
    }

}