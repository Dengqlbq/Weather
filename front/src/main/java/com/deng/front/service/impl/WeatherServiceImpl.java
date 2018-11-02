package com.deng.front.service.impl;

import com.deng.front.dao.WeatherDao;
import com.deng.front.dataobject.DailyForecast;
import com.deng.front.service.WeatherService;
import com.deng.front.vo.WeatherVo;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 天气数据
 * @author: Deng
 * @create: 2018/11/02
 */
@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherDao weatherDao;

    @Override
    public WeatherVo getWeatherDataByCityId(String id) {
        String data = weatherDao.getWeatherDataByCityId(id);
        if (StringUtils.isEmpty(data)) {
            // TODO 重定向到错误页面 and 添加状态枚举
            log.error("[天气预报展示]: 查询不到数据 cityId: {}", id);
            return new WeatherVo(1);
        }

        WeatherVo weatherVo = new WeatherVo(0);
        JsonObject jsonObject = new JsonParser().parse(data).getAsJsonObject().getAsJsonArray("HeWeather6").get(0).getAsJsonObject();
        JsonObject basicInfo = jsonObject.getAsJsonObject("basic");
        JsonArray jsonArray = jsonObject.getAsJsonArray("daily_forecast");

        // 地理数据
        weatherVo.setLocation(basicInfo.get("location").getAsString());
        weatherVo.setLat(basicInfo.get("lat").getAsDouble());
        weatherVo.setLon(basicInfo.get("lon").getAsDouble());

        // 天气预报
        List<DailyForecast> dailyForecastList = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            JsonObject jo = element.getAsJsonObject();
            DailyForecast forecast = new DailyForecast();

            forecast.setCondTxtD(jo.get("cond_txt_d").getAsString());
            forecast.setHum(jo.get("hum").getAsFloat());
            forecast.setSr(jo.get("sr").getAsString());
            forecast.setTmpMax(jo.get("tmp_max").getAsFloat());
            forecast.setTmpMin(jo.get("tmp_min").getAsFloat());
            forecast.setUvIndex(jo.get("uv_index").getAsInt());
            forecast.setWindDir(jo.get("wind_dir").getAsString());
            forecast.setWindSc(jo.get("wind_sc").getAsString());

            dailyForecastList.add(forecast);
        }

        weatherVo.setDailyForecastList(dailyForecastList);
        return weatherVo;
    }
}
