package com.masun.controller;

import com.masun.domain.Re;
import com.masun.pojo.entity.Stock;
import com.masun.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author masun
 */
@RestController
@RequestMapping("stock")
public class StockController {

    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{id}")
    public Re<?> findStock(@PathVariable Long id){
        Stock stockById = stockService.findStockById(id);
        return Re.ok(stockById);
    }

    @PutMapping()
    public Re<?> modifyStockNum(@RequestBody Stock stock){
        int count = stockService.modifyStockNum(stock);
        return Re.ok();
    }
}
