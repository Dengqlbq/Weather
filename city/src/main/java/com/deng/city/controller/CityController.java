package com.deng.city.controller;

import com.deng.city.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description: 城市地理数据
 * @author: Deng
 * @create: 2018/11/2
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    /**
     * 获取城市列表
     *
     * @return map<代号，城市名>
     */
    @GetMapping("/list")
    private Map<String, String> list() {
        return cityService.getCityData();
    }
}
