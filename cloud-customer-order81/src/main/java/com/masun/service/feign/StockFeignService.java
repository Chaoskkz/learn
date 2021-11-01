package com.masun.service.feign;

import com.masun.domain.Re;
import com.masun.pojo.entity.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * @author masun
 */
@Component
@FeignClient(value = "provider-stock", path = "/stock")
public interface StockFeignService {


    @GetMapping("/{id}")
    Re<?> findStock(@PathVariable("id") Long id);

    @PutMapping()
    Re<?> modifyStockNum(@RequestBody Stock stock);
}
