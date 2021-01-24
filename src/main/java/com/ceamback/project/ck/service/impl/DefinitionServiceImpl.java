package com.ceamback.project.ck.service.impl;

import com.ceamback.project.ck.domain.Definition;
import com.ceamback.project.ck.mapper.DefinitionMapper;
import com.ceamback.project.ck.service.IDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefinitionServiceImpl implements IDefinitionService {

    @Autowired
    private DefinitionMapper definitionMapper;

    @Override
    public List<Definition> selectList() {
        return definitionMapper.selectList();
    }

    @Override
    public Definition selectById(Integer id) {
        return definitionMapper.selectById(id);
    }

    @Override
    public int insert(Definition definition) {
        return definitionMapper.insert(definition);
    }

    @Override
    public int update(Definition definition) {
        return definitionMapper.update(definition);
    }

    @Override
    public int deleteById(Integer id) {
        return definitionMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Integer[] ids) {
        return definitionMapper.deleteByIds(ids);
    }
}
