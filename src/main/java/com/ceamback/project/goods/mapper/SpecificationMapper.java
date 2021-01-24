package com.ceamback.project.goods.mapper;

import com.ceamback.project.goods.domain.Specification;

import java.util.List;

public interface SpecificationMapper {

    public List<Specification> selectSpecificationList(Specification specification);

    public List<Specification> selectSpecListBuyId(Long id);

    public int checkSpecNameUnique(String specName);

    public int insertSpecification(Specification specification);

    public int updateSpecification(Specification specification);

    public int deleteSpecificationById(Long id);

    public int deleteSpecificationByIds(Long[] ids);
}
