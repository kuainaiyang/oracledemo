package com.wdk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wdk.demo.dao.Test;

public interface TestService extends IService<Test> {

    Test getOne();
}
