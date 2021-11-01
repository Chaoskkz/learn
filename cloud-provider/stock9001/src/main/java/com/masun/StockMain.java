package com.masun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author masun
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StockMain {
    public static void main(String[] args) {
        //设置druid连接池超时配置项
        System.setProperty("druid.mysql.userPingMethod","false");
        SpringApplication.run(StockMain.class);
    }
}
