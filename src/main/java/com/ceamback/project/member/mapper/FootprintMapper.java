package com.ceamback.project.member.mapper;

import com.ceamback.project.member.domain.Footprint;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FootprintMapper {

    public List<Footprint> selectFootprintList(Footprint footprint);

    public int deleteById(@Param("id") Long id);

    public int deleteByIds(Long[] ids);
}
