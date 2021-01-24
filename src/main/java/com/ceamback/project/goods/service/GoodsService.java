package com.ceamback.project.goods.service;

import com.ceamback.project.goods.domain.Goods;

import java.util.List;

public interface GoodsService {

    public List<Goods> selectList(Goods goods);

    public Goods selectGoodsById(Long id);

    public int add(Goods goods);

    public int edit(Goods goods);

    public int enSale(Long id);

    public int unSale(Long id);

    public int deleteById(Long id);

    public int deleteByIds(Long[] ids);
}
