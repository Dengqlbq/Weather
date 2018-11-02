package com.deng.city.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CityDaoTest {

    @Autowired
    private CityDao dao;

    @Test
    public void getCityData() {
        Assert.assertNotNull(dao.getCityData());
    }
}