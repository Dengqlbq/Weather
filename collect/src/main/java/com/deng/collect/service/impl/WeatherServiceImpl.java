package com.deng.collect.service.impl;

import com.deng.collect.dao.WeatherDao;
import com.deng.collect.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 原始城市天气数据
 * @author: Deng
 * @create: 2018/11/02
 */
@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

    @Value("${api.weather}")
    private String url;

    @Autowired
    private WeatherDao weatherDao;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getWeatherByCityId(String id) {
        return restTemplate.getForEntity(String.format(url, id), String.class).getBody();
    }

    @Override
    public void save(String cityId, String data) {
        if (StringUtils.isEmpty(data)) {
            log.error("[天气采集服务]: 天气数据为空 cityId: {}", cityId);
        } else {
            weatherDao.save(cityId, data);
        }
    }
}
