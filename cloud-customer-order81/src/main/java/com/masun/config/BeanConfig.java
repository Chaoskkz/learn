package com.masun.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author masun
 */
@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRest(RestTemplateBuilder builder){
        return builder.build();
    }

}
