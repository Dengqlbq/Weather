package com.deng.front.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * @description: 天气数据
 * @author: Deng
 * @create: 2018/11/02
 */
@Repository
public class WeatherDao {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public String getWeatherDataByCityId(String cityId) {
        if (redisTemplate.hasKey(cityId)) {
            return redisTemplate.opsForValue().get(cityId);
        }
        return null;
    }
}
