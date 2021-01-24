package com.ceamback.project.order.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.order.domain.Order;
import com.ceamback.project.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order/order")
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/list")
    public TableDataInfo list(Order order){
        startPage();
        List<Order> list=orderService.selectList(order);
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectOrderById(Long id){
        return AjaxResult.success(orderService.selectOrderById(id));
    }

    @PostMapping
    public AjaxResult add(@Validated @RequestBody Order order){
        return toAjax(orderService.add(order));
    }

    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Order order){
        return toAjax(orderService.edit(order));
    }

    @PutMapping("/sendGoods")
    public AjaxResult send(@RequestBody Order order){
        return toAjax(orderService.sendGoods(order));
    }

    @PutMapping("/{id}")
    public AjaxResult confirm(@PathVariable Long id){
        return toAjax(orderService.confirm(id));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult delete(@PathVariable Long[] ids){
        return toAjax(orderService.deleteByIds(ids));
    }

}
