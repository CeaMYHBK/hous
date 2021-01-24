package com.ceamback.project.goods.mapper;

import com.ceamback.project.goods.domain.Type;

import java.util.List;

public interface TypeMapper {

    public List<Type> selectTypeList(Type type);

    public Type selectTypeById(Long typeId);

    public int checkTypeNameUnique(String typeName);

    public int insertType(Type type);

    public int updateType(Type type);

    public int deleteTypeById(Long typeId);

    public int deleteTypeByIds(Long[] typeIds);
}
