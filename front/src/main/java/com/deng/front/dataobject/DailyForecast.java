package com.deng.front.dataobject;

import lombok.Data;

/**
 * @description: 天气预报
 *               接口文档: http://www.heweather.com/douments/api/s6/weather-forecast
 * @author: Deng
 * @create: 2018/11/02
 */
@Data
public class DailyForecast {

    /** 日出时间 */
    private String sr;

    /** 最高温度 */
    private float tmpMax;

    /** 最低温度 */
    private float tmpMin;

    /** 风向 */
    private String windDir;

    /** 风力 */
    private String windSc;

    /** 相对湿度 */
    private float hum;

    /** 紫外线强度指数 */
    private int uvIndex;

    /** 白天天气描述 */
    private String condTxtD;
}
