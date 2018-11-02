package com.deng.city.service;

import java.util.Map;

/**
 * @description: 城市地理数据
 * @author: Deng
 * @create: 2018/11/2
 */
public interface CityService {

    /**
     * 获取城市列表
     *
     * @return map<代号，城市名>
     */
    Map<String, String> getCityData();
}
