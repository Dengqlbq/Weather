package com.deng.city.service.impl;

import com.deng.city.service.CityService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CityServiceImplTest {

    @Autowired
    private CityService cityService;

    @Test
    public void getCityData() {
        Assert.assertNotNull(cityService.getCityData());
    }
}