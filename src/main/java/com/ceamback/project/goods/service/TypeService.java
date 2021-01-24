package com.ceamback.project.goods.service;

import com.ceamback.project.goods.domain.Type;

import java.util.List;

public interface TypeService {

    public List<Type> selectTypeList(Type type);

    public Type selectTypeById(Long typeId);

    public String checkTypeNameUnique(String typeName);

    public int insertType(Type type);

    public int updateType(Type type);

    public int deleteTypeById(Long typeId);

    public int deleteTypeByIds(Long[] typeIds);
}
