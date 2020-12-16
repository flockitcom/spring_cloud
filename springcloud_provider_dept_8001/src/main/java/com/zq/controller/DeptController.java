package com.zq.controller;

import com.zq.entity.Dept;
import com.zq.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zqian
 * @date 2020/12/15
 */
@RestController
@RequestMapping("dept")
public class DeptController {

    @Resource
    private DeptService deptService;

    @PostMapping("/add")
    public Integer addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept getDept(@PathVariable("id") Integer id){
        return deptService.selectById(id);
    }

    @GetMapping("/list")
    public List<Dept> listDept(){
        return deptService.selectAll();
    }
}
