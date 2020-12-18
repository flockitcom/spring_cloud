package com.zq.service;

import com.zq.entity.Dept;

import java.util.List;

/**
 * @author zqian
 * @date 2020/12/15
 */
public interface DeptService {
    Dept selectById(Integer id);

    List<Dept> selectAll();

    Integer addDept(Dept dept);
}
