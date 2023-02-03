package com.wdk.demo.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@TableName("ZT_TEST")
@Getter
@Setter
public class Test {

    @TableField("id")
    public long id;
    @TableField("name")
    private String name;

}
