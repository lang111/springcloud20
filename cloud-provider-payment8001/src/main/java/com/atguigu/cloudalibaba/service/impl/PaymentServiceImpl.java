package com.atguigu.cloudalibaba.service.impl;

import com.atguigu.cloudalibaba.dao.PaymentDao;
import com.atguigu.cloudalibaba.entities.Payment;
import com.atguigu.cloudalibaba.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return this.paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return this.paymentDao.getPaymentById(id);
    }
}
