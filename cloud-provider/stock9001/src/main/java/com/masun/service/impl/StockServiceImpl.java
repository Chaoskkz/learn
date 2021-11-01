package com.masun.service.impl;

import com.masun.mapper.StockMapper;
import com.masun.pojo.entity.Stock;
import com.masun.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author masun
 */
@Service
public class StockServiceImpl implements StockService {

    private final StockMapper stockMapper;

    @Autowired
    public StockServiceImpl(StockMapper stockMapper) {
        this.stockMapper = stockMapper;
    }

    @Override
    public Stock findStockById(Long stockId) {
        return stockMapper.selectById(stockId);
    }

    @Override
    public int modifyStockNum(Stock stock) {
        Stock stock1=new Stock();
        stock1.setId(stock.getId());
        stock1.setNum(stock.getNum());
        return stockMapper.updateById(stock1);
    }

    @Override
    public int createStock(Stock stock) {
        return stockMapper.insert(stock);
    }
}
