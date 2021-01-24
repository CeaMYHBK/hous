package com.ceamback.project.ck.mapper;

import com.ceamback.project.ck.domain.Definition;
import com.ceamback.project.goods.domain.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DefinitionMapper {


    public List<Definition> selectList();

    public Definition selectById(@Param("id") Integer id);

    public int insert(Definition definition);

    public int update(Definition definition);

    public int deleteById(Integer id);

    public int deleteByIds(Integer[] ids);
}
