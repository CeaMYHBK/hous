package com.ceamback.project.goods.service.impl;

import com.ceamback.common.exception.BaseException;
import com.ceamback.project.goods.domain.Goods;
import com.ceamback.project.goods.mapper.GoodsMapper;
import com.ceamback.project.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectList(Goods goods) {
        return goodsMapper.selectList(goods);
    }

    @Override
    public Goods selectGoodsById(Long id) {
        return null;
    }

    @Override
    public int add(Goods goods) {
        return goodsMapper.add(goods);
    }

    @Override
    public int edit(Goods goods) {
        return goodsMapper.edit(goods);
    }

    @Override
    public int enSale(Long id) {
        Goods goods=goodsMapper.selectGoodsById(id);
        if (goods.getStatus().equals("1")){
            throw new BaseException("此商品已处于上架状态！");
        }
        goods.setStatus("1");
        goods.setId(id);
        return goodsMapper.edit(goods);
    }

    @Override
    public int unSale(Long id) {
        Goods goods=goodsMapper.selectGoodsById(id);
        if (goods.getStatus().equals("0")){
            throw new BaseException("此商品已处于下架状态！");
        }
        goods.setStatus("0");
        goods.setId(id);
        return goodsMapper.edit(goods);
    }

    @Override
    public int deleteById(Long id) {
        return goodsMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Long[] ids) {
        return goodsMapper.deleteByIds(ids);
    }
}
