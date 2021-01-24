package com.ceamback.project.ck.service;

import com.ceamback.project.ck.domain.Definition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDefinitionService {

    public List<Definition> selectList();

    public Definition selectById(@Param("id") Integer id);

    public int insert(Definition definition);

    public int update(Definition definition);

    public int deleteById(Integer id);

    public int deleteByIds(Integer[] ids);
}
