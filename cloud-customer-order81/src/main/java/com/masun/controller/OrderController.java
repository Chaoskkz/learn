package com.masun.controller;

import com.masun.domain.Re;
import com.masun.pojo.entity.Order;
import com.masun.pojo.entity.OrderItem;
import com.masun.pojo.entity.Stock;
import com.masun.service.feign.StockFeignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author masun
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private StockFeignService stockFeignService;



    @GetMapping("/stock/{id}")
    public Re<?> findStock(@PathVariable("id") Long stockId) {
        return stockFeignService.findStock(stockId);
    }

    @PostMapping("/settlement")
    public Re<?> settlement(@RequestBody Order order){
        List<OrderItem> itemList = order.getItemList();
        for (OrderItem orderItem : itemList) {
            Stock stock=new Stock();
            stock.setId(orderItem.getStockId());
            stock.setNum(orderItem.getCount());
            //restTemplate.put(UrlConstant.URL_PROVIDER_STOCK+"/stock",stock);
            stockFeignService.modifyStockNum(stock);
        }
        return  Re.ok(null,"订单结算完成");
    }
}
