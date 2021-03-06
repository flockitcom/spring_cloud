package com.zq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zqian
 * @date 2020/12/15
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConsumerDept80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerDept80.class, args);
    }
}
