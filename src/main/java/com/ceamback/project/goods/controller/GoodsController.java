package com.ceamback.project.goods.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.goods.domain.Goods;
import com.ceamback.project.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods/goods")
public class GoodsController extends BaseController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/list")
    public TableDataInfo list(Goods goods){
        startPage();
        List<Goods> list=goodsService.selectList(goods);
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectGoodsById(@PathVariable Long id){
        return AjaxResult.success(goodsService.selectGoodsById(id));
    }

    @PostMapping
    public AjaxResult add(@Validated @RequestBody Goods goods){
        return toAjax(goodsService.add(goods));
    }

    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Goods goods){
        return toAjax(goodsService.edit(goods));
    }

    @PutMapping("/{id}")
    public AjaxResult enSale(@PathVariable("id") Long id){
        return toAjax(goodsService.enSale(id));
    }

    @PostMapping("/{id}")
    public AjaxResult unSale(@PathVariable("id") Long id){
        return toAjax(goodsService.unSale(id));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult delete(@PathVariable Long[] ids){
        return toAjax(goodsService.deleteByIds(ids));
    }
}
