package com.ceamback.project.order.service.impl;

import com.ceamback.common.exception.BaseException;
import com.ceamback.project.order.domain.Order;
import com.ceamback.project.order.mapper.OrderMapper;
import com.ceamback.project.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectList(Order order) {
        return orderMapper.selectList(order);
    }

    @Override
    public Order selectOrderById(Long id) {
        return orderMapper.selectOrderById(id);
    }

    @Override
    public int add(Order order) {
        return orderMapper.add(order);
    }

    @Override
    public int edit(Order order) {
        return orderMapper.edit(order);
    }

    @Override
    public int sendGoods(Order order) {
        if (0 == order.getPayStatus()){
            throw new BaseException("此订单未付款");
        }
        order.setStatus(300);
        order.setShippingStatus(1);
        return orderMapper.edit(order);
    }

    @Override
    public int confirm(Long id) {
        Order order = orderMapper.selectOrderById(id);
        if (2 != order.getPayStatus()) {
            throw new BaseException("此订单未付款，不能确认收货！");
        }
        if (3 == order.getShippingStatus()) {
            throw new BaseException("此订单处于退货状态，不能确认收货！");
        }
        if (0 == order.getShippingStatus()) {
            throw new BaseException("此订单未发货，不能确认收货！");
        }
        order.setShippingStatus(2);
        order.setStatus(301);
        return orderMapper.edit(order);
    }

    @Override
    public int deleteById(Long id) {
        return orderMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Long[] ids) {
        return orderMapper.deleteByIds(ids);
    }

}
