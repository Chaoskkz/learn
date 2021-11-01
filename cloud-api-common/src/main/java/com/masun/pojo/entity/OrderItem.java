package com.masun.pojo.entity;

import lombok.Data;

/**
 * 订单条目类
 *
 * @author masun
 */
@Data
public class OrderItem {

    /**
     * 所属订单id
     */
    private Long orderId;

    /**
     * 物品id
     */
    private Long stockId;


    /**
     * 具体物品数量
     */
    private Integer count;
}
