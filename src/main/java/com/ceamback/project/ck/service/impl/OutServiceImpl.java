package com.ceamback.project.ck.service.impl;

import com.ceamback.common.utils.SecurityUtils;
import com.ceamback.project.ck.domain.Out;
import com.ceamback.project.ck.mapper.OutMapper;
import com.ceamback.project.ck.service.IOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutServiceImpl implements IOutService {

    @Autowired
    private OutMapper outMapper;

    @Override
    public List<Out> selectList() {
        return outMapper.selectList();
    }

    @Override
    public Out selectById(Integer id) {
        return outMapper.selectById(id);
    }

    @Override
    public int insert(Out out) {
        out.setCreateBy(SecurityUtils.getUsername());
        return outMapper.insert(out);
    }

    @Override
    public int update(Out out) {
        return outMapper.update(out);
    }

    @Override
    public int deleteById(Integer id) {
        return outMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Integer[] ids) {
        return outMapper.deleteByIds(ids);
    }
}
