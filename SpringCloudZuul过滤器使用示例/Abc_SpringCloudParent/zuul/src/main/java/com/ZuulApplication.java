package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 项目启动类
 *
 * @author JustryDeng
 * @date 2019/2/25 23:50
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
