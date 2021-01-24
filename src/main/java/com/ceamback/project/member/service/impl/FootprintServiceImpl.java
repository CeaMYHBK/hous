package com.ceamback.project.member.service.impl;

import com.ceamback.project.member.domain.Footprint;
import com.ceamback.project.member.mapper.FootprintMapper;
import com.ceamback.project.member.service.FootprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootprintServiceImpl implements FootprintService {

    @Autowired
    private FootprintMapper footprintMapper;

    @Override
    public List<Footprint> selectFootprintList(Footprint footprint) {
        return footprintMapper.selectFootprintList(footprint);
    }

    @Override
    public int deleteById(Long id) {
        return footprintMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Long[] ids) {
        return footprintMapper.deleteByIds(ids);
    }

}
