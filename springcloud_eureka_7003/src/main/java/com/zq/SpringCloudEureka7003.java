package com.zq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zqian
 * @date 2020/12/15
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka7003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka7003.class, args);
    }
}
