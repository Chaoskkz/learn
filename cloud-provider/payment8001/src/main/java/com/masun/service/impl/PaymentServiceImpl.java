package com.masun.service.impl;

import com.masun.mapper.PaymentMapper;
import com.masun.pojo.entity.Payment;
import com.masun.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author masun
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentMapper paymentMapper;

    @Autowired
    public PaymentServiceImpl(PaymentMapper paymentMapper) {
        this.paymentMapper = paymentMapper;
    }

    @Override
    public Payment findOne(Long paymentId) {
        return paymentMapper.selectOneById(paymentId);
    }

    @Override
    public int createOne(Payment payment) {
        return paymentMapper.insert(payment);
    }
}
