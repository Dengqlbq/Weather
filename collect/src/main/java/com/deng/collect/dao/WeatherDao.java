package com.deng.collect.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @description: 原始天气数据
 * @author: Deng
 * @create: 2018/11/2
 */
@Repository
public class WeatherDao {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void save(String key, String data) {
        redisTemplate.opsForValue().set(key, data, 30, TimeUnit.MINUTES);
    }
}
