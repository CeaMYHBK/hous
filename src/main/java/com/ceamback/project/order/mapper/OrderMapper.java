package com.ceamback.project.order.mapper;

import com.ceamback.project.order.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    public List<Order> selectList(Order order);

    public Order selectOrderById(@Param("id") Long id);

    public int add(Order order);

    public int edit(Order order);

    public int deleteById(@Param("id") Long id);

    public int deleteByIds(Long[] ids);
}
