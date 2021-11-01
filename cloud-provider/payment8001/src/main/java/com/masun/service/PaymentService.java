package com.masun.service;

import com.masun.pojo.entity.Payment;

/**
 * @author masun
 */
public interface PaymentService {

    Payment findOne(Long paymentId);

    int createOne(Payment payment);
}
