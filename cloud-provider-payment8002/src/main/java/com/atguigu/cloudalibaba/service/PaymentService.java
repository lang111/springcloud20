package com.atguigu.cloudalibaba.service;


import com.atguigu.cloudalibaba.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
