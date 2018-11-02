package com.deng.collect.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @description: 城市地理数据
 * @author: Deng
 * @create: 2018/11/2
 */
@FeignClient("weather-city")
@Component
public interface CityService {

    /**
     * 获取城市列表
     *
     * @return map<代号,城市名>
     */
    @GetMapping("/city/list")
    Map<String, String> getCityList();
}
