package com.deng.front.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WeatherDaoTest {

    @Autowired
    private WeatherDao dao;

    @Test
    public void getWeatherDataByCityId() {
        String location = "CN101281005";
        String data = dao.getWeatherDataByCityId(location);
        Assert.assertNotEquals(0, data.length());
    }
}