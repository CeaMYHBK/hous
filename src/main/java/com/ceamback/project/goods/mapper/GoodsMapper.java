package com.ceamback.project.goods.mapper;

import com.ceamback.project.goods.domain.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    public List<Goods> selectList(Goods goods);

    public Goods selectGoodsById(@Param("id") Long id);

    public int add(Goods goods);

    public int edit(Goods goods);

    public int deleteById(@Param("id") Long id);

    public int deleteByIds(Long[] ids);
}
