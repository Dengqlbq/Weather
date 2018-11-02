package com.deng.front.service;

import com.deng.front.vo.WeatherVo;

/**
 * @description: 天气数据
 * @author: Deng
 * @create: 2018/11/02
 */
public interface WeatherService {

    /**
     * 获取城市数据
     *
     * @param id
     * @return
     */
    WeatherVo getWeatherDataByCityId(String id);
}
