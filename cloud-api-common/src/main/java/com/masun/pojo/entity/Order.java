package com.masun.pojo.entity;

import lombok.Data;

import java.util.List;

/**
 * @author masun
 */
@Data
public class Order {

    private Long id;

    private List<OrderItem> itemList;

}
