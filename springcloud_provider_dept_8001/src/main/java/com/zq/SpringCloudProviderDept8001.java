package com.zq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zqian
 * @date 2020/12/15
 */
@SpringBootApplication
@MapperScan("com.zq.mapper")
@EnableEurekaClient
public class SpringCloudProviderDept8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderDept8001.class, args);
    }
}
