package com.atguigu.cloudalibaba.service;

import com.atguigu.cloudalibaba.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
