package com.wangchao.o2o;

import com.wangchao.o2o.dao.AreaDao;
import com.wangchao.o2o.entity.Area;
import com.wangchao.o2o.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-datasource.xml","classpath:spring/spring-service.xml"})
public class BaseTest {


    @Autowired
    private AreaService areaService;

    @Test
    public void test(){
        List<Area> areas = areaService.queryArea();
        System.out.println(123);
    }
}
