package com.deng.front.service.impl;

import com.deng.front.service.WeatherService;
import com.deng.front.vo.WeatherVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WeatherServiceImplTest {

    @Autowired
    private WeatherService weatherService;

    @Test
    public void getWeatherDataByCityId() {
        String location = "CN101281005";
        WeatherVo weatherVo = weatherService.getWeatherDataByCityId(location);
        Assert.assertEquals(new Integer(0), weatherVo.getStatus());
    }
}