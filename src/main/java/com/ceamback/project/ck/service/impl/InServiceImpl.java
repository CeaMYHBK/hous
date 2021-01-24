package com.ceamback.project.ck.service.impl;

import com.ceamback.common.utils.SecurityUtils;
import com.ceamback.project.ck.domain.In;
import com.ceamback.project.ck.mapper.InMapper;
import com.ceamback.project.ck.service.IInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InServiceImpl implements IInService {

    @Autowired
    private InMapper inMapper;

    @Override
    public List<In> selectList() {
        return inMapper.selectList();
    }

    @Override
    public In selectById(Integer id) {
        return inMapper.selectById(id);
    }

    @Override
    public int insert(In in) {
        in.setCreateBy(SecurityUtils.getUsername());
        return inMapper.insert(in);
    }

    @Override
    public int update(In in) {
        return inMapper.update(in);
    }

    @Override
    public int deleteById(Integer id) {
        return inMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Integer[] ids) {
        return inMapper.deleteByIds(ids);
    }
}
