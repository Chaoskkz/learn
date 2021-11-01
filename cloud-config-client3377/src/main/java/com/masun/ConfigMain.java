package com.masun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 配置中心启动器
 * @author masun
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain.class);
    }
}
