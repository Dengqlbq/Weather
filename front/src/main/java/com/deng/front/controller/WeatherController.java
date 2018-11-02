package com.deng.front.controller;

import com.deng.front.service.WeatherService;
import com.deng.front.vo.WeatherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @description: 天气预报展示
 * @author: Deng
 * @create: 2018/11/2
 */
@Controller
@RequestMapping("/front")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    /**
     * 展示特定城市的天气预报
     *
     * @param cityId 城市代号
     * @param map
     * @return
     */
    @GetMapping("/city/{cityId}")
    public ModelAndView cityWeather(@PathVariable("cityId") String cityId, Map<String, Object> map) {
        WeatherVo weatherVo = weatherService.getWeatherDataByCityId(cityId);
        map.put("weather", weatherVo);
        return new ModelAndView("index", map);
    }
}
