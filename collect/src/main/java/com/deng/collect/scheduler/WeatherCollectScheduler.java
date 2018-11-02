package com.deng.collect.scheduler;

import com.deng.collect.service.CityService;
import com.deng.collect.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @description: 定期采集天气
 * @author: Deng
 * @create: 2018/11/02
 */
@Component
@Slf4j
public class WeatherCollectScheduler {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private CityService cityService;

    @Scheduled(fixedDelay = 30 * 60 * 1000)
    public void collect() {
        Map<String, String> map = cityService.getCityList();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            log.info("[天气采集服务]: 正在采集: {}", entry.getValue());
            String data = weatherService.getWeatherByCityId(entry.getKey());
            weatherService.save(entry.getKey(), data);
        }

        log.info("[天气采集服务]: 数据采集完毕");
    }
}
