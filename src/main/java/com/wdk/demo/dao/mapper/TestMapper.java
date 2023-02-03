package com.wdk.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wdk.demo.dao.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper extends BaseMapper<Test> {

    @Select("SELECT * from ZT_TEST ")
    Test selectByIds(int i);
}
