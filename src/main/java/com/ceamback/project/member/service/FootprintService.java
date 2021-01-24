package com.ceamback.project.member.service;

import com.ceamback.project.member.domain.Footprint;

import java.util.List;

public interface FootprintService {

    public List<Footprint> selectFootprintList(Footprint footprint);

    public int deleteById(Long id);

    public int deleteByIds(Long[] ids);
}
