package com.zq.controller;

import com.zq.entity.Dept;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zqian
 * @date 2020/12/15
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptConsumerController {

    //    public static final String REST_URL_PRE = "http://127.0.0.1:8001";

    public static final String REST_URL_PRE = "http://SPRINGCLOUD-PROVIDER-DEPT"; //通过服务名启动

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public Integer addDept(Dept dept) {
        return restTemplate.postForObject(REST_URL_PRE + "/dept/add", dept, Integer.class);
    }

    @RequestMapping("/get/{id}")
    public Dept getDept(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PRE + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PRE + "/dept/list", List.class);
    }
}
