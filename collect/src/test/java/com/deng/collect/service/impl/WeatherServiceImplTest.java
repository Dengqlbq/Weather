package com.deng.collect.service.impl;

import com.deng.collect.service.WeatherService;
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

    private final String LOCATION = "CN101280606";

    @Test
    public void getWeatherByCityId() {
        Assert.assertNotEquals(0, weatherService.getWeatherByCityId(LOCATION).length());
    }

    @Test
    public void save() {
        weatherService.save(LOCATION + "test", weatherService.getWeatherByCityId(LOCATION));
    }
}