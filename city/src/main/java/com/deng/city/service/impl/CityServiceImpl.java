package com.deng.city.service.impl;

import com.deng.city.dao.CityDao;
import com.deng.city.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @description: 城市地理数据
 * @author: Deng
 * @create: 2018/11/2
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public Map<String, String> getCityData() {
        return cityDao.getCityData();
    }
}
