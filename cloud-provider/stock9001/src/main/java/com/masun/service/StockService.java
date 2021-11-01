package com.masun.service;

import com.masun.pojo.entity.Stock;

/**
 * @author masun
 */
public interface StockService {

    Stock findStockById(Long stockId);

    int modifyStockNum(Stock stock);

    int createStock(Stock stock);
}
