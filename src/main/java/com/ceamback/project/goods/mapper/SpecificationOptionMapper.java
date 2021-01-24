package com.ceamback.project.goods.mapper;

import com.ceamback.project.goods.domain.SpecificationOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface SpecificationOptionMapper {

    public int insertOptions(SpecificationOption option);

    public int updateOptions(SpecificationOption option);

    public int deleteSpecOptionBySpecId(Long specId);

    public int deleteSpecOptionBySpecIds(Long[] specIds);

    public int deleteSpecOptionById(Long optionId);

    public int deleteSpecOptionByIds(Long[] optionIds);
}
