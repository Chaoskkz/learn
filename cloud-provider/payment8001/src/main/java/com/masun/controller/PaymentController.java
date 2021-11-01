package com.masun.controller;

import com.masun.domain.Re;
import com.masun.pojo.entity.Payment;
import com.masun.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author masun
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/{id}")
    public Re<?> findOne(@PathVariable Long id){
        Payment one = paymentService.findOne(id);
        return Re.ok(one,"查询成功");
    }

}
