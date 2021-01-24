package com.ceamback.project.order.service;

import com.ceamback.project.order.domain.Order;

import java.util.List;

public interface OrderService {

    public List<Order> selectList(Order order);

    public Order selectOrderById(Long id);

    public int add(Order order);

    public int edit(Order order);

    public int sendGoods(Order order);

    public int confirm(Long id);

    public int deleteById(Long id);

    public int deleteByIds(Long[] ids);
}
