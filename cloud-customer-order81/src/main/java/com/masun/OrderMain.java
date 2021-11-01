package com.masun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author masun
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class);
    }
}
