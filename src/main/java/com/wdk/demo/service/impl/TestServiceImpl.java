package com.wdk.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wdk.demo.dao.Test;
import com.wdk.demo.dao.mapper.TestMapper;
import com.wdk.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Test getOne() {
        QueryWrapper<Test> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1);
        return testMapper.selectByIds(1);
    }
}
