package com.zq.service.impl;

import com.zq.entity.Dept;
import com.zq.mapper.DeptMapper;
import com.zq.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zqian
 * @date 2020/12/15
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public Dept selectById(Integer id) {
        return deptMapper.selectById(id);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.selectList(null);
    }

    @Override
    public Integer addDept(Dept dept) {
        return deptMapper.insert(dept);
    }
}
