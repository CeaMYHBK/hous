package com.ceamback.project.goods.service;

import com.ceamback.project.goods.domain.Specification;
import com.ceamback.project.goods.domain.SpecificationOption;

import java.util.List;

public interface SpecificationService {

    public List<Specification> selectSpecificationList(Specification specification);

    public List<Specification> selectSpecListBuyId(Long id);

    public String checkSpecNameUnique(String specName);

    public int insertSpecification(Specification specification);

    public int updateSpecification(Specification specification);

    public int deleteSpecificationById(Long specId);

    public int deleteSpecificationByIds(Long[] specIds);
}
