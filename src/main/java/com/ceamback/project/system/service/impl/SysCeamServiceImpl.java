package com.ceamback.project.system.service.impl;

import com.ceamback.project.system.domain.SysCeam;
import com.ceamback.project.system.mapper.SysCeamMapper;
import com.ceamback.project.system.service.ISysCeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysCeamServiceImpl implements ISysCeamService {

    @Autowired
    private SysCeamMapper ceamMapper;

    @Override
    public List<SysCeam> selectCeamList(SysCeam ceam) {
        return ceamMapper.selectCeamList(ceam);
    }

    @Override
    public SysCeam selectCeamById(Long ceamId) {
        return ceamMapper.selectCeamById(ceamId);
    }

    @Override
    public int updateCeam(SysCeam ceam) {
        return ceamMapper.updateCeam(ceam);
    }

    @Override
    public int insertCeam(SysCeam ceam) {
        return ceamMapper.insertCeam(ceam);
    }

    @Override
    public int deleteCeamById(Long ceamId) {
        return ceamMapper.deleteCeamById(ceamId);
    }

    @Override
    public int deleteCeamByIds(Long[] ceamIds) {
        return ceamMapper.deleteCeamByIds(ceamIds);
    }
}
