package com.ceamback.project.goods.service.impl;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.project.goods.domain.Type;
import com.ceamback.project.goods.mapper.TypeMapper;
import com.ceamback.project.goods.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> selectTypeList(Type type) {
        return typeMapper.selectTypeList(type);
    }

    @Override
    public Type selectTypeById(Long typeId) {
        return typeMapper.selectTypeById(typeId);
    }

    @Override
    public String checkTypeNameUnique(String typeName) {
        int count =typeMapper.checkTypeNameUnique(typeName);
        if (count >0){
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    @Override
    public int insertType(Type type) {
        return typeMapper.insertType(type);
    }

    @Override
    public int updateType(Type type) {
        return typeMapper.updateType(type);
    }

    @Override
    public int deleteTypeById(Long typeId) {
        return typeMapper.deleteTypeById(typeId);
    }

    @Override
    public int deleteTypeByIds(Long[] typeIds) {
        return typeMapper.deleteTypeByIds(typeIds);
    }
}
