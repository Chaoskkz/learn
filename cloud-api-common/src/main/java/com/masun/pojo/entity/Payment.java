package com.masun.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author masun
 */
@TableName("payment")
@Data
public class Payment {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;
}
