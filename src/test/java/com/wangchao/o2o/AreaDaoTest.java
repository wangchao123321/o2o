package com.wangchao.o2o;

import com.wangchao.o2o.dao.AreaDao;
import com.wangchao.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void test(){
//        List<Area> areas = areaDao.queryArea();
        System.out.println(123);
    }
}
