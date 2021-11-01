package com.masun.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author masun
 */
@TableName("stock")
@Data
public class Stock {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer num;
}
