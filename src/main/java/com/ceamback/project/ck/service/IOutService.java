package com.ceamback.project.ck.service;

import com.ceamback.project.ck.domain.Out;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IOutService {

    public List<Out> selectList();

    public Out selectById(@Param("id") Integer id);

    public int insert(Out out);

    public int update(Out out);

    public int deleteById(Integer id);

    public int deleteByIds(Integer[] ids);
}
