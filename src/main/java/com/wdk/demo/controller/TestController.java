package com.wdk.demo.controller;

import com.wdk.demo.dao.Test;
import com.wdk.demo.service.TestService;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import javax.sql.DataSource;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private DataSource dataSource;

    @GetMapping("/oracle")
    public String test() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            connection.getSchema();
            DatabaseMetaData metaData = connection.getMetaData();
            dataSource.getConnection();
            Test test = testService.getById(1);

        } catch (Exception e) {
            log.error("失败", e);
            return "失败";
        }
        return "成功";
    }
}
