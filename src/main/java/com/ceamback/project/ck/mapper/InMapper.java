package com.ceamback.project.ck.mapper;

import com.ceamback.project.ck.domain.In;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InMapper {

    public List<In> selectList();

    public In selectById(@Param("id") Integer id);

    public int insert(In in);

    public int update(In in);

    public int deleteById(Integer id);

    public int deleteByIds(Integer[] ids);
}
