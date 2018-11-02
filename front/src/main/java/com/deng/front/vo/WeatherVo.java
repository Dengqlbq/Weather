package com.deng.front.vo;

import com.deng.front.dataobject.DailyForecast;
import lombok.Data;

import java.util.List;

/**
 * @description: 天气数据VO
 * @author: Deng
 * @create: 2018/11/02
 */
@Data
public class WeatherVo {

    /** 状态 */
    private Integer status;

    /** 城市名 */
    private String location;

    /** 经度 */
    private double lat;

    /** 维度 */
    private double lon;

    /** 天气预报 */
    List<DailyForecast> dailyForecastList;

    public WeatherVo(Integer status) {
        this.status = status;
    }
}
