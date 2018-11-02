package com.deng.collect.service;

/**
 * @description: 原始天气数据
 * @author: Deng
 * @create: 2018/11/02
 */
public interface WeatherService {

    /**
     * 获取城市天气数据
     *
     * @param id 城市id
     * @return 天气数据
     */
    String getWeatherByCityId(String id);

    /**
     * 保存城市天气数据
     *
     * @param cityId 城市id
     * @param data 天气数据
     */
    void save(String cityId, String data);
}
