package com.deng.city.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 城市地理数据
 * @author: Deng
 * @create: 2018/11/2
 */
@Slf4j
@Repository
public class CityDao {

    /**
     * 获取城市列表
     *
     * @return map<代号，城市名>
     */
    public Map<String, String> getCityData() {
        Map<String, String> map = new HashMap<>();
        try {
            /**
             *  File file = ResourceUtils.getFile("classpath:city.txt");
             *  InputStreamReader input = new InputStreamReader(new FileInputStream(file));
             *  这里在IDE中调试时可用，打成jar包后报错找不到文件
             *  getResource方法中的File Path是编译后的路径
             */
            InputStream is = this.getClass().getResourceAsStream("/city.txt");
            InputStreamReader input = new InputStreamReader(is);
            BufferedReader bufferedReader = new BufferedReader(input);

            String line = bufferedReader.readLine();
            while (!StringUtils.isEmpty(line)) {
                map.put(line.split(":")[0], line.split(":")[1]);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            log.error("[城市地理数据服务]: city.txt不存在");
        } catch (IOException e) {
            log.error("[城市地理数据服务]: 读取出错");
        }

        return map;
    }
}
