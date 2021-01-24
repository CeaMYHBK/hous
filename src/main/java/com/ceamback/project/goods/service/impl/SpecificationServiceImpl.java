package com.ceamback.project.goods.service.impl;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.project.goods.domain.Specification;
import com.ceamback.project.goods.domain.SpecificationOption;
import com.ceamback.project.goods.mapper.SpecificationMapper;
import com.ceamback.project.goods.mapper.SpecificationOptionMapper;
import com.ceamback.project.goods.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private SpecificationMapper specificationMapper;

    @Autowired
    private SpecificationOptionMapper specificationOptionMapper;

    @Override
    public List<Specification> selectSpecificationList(Specification specification) {
        return specificationMapper.selectSpecificationList(specification);
    }

    @Override
    public List<Specification> selectSpecListBuyId(Long id) {
        return specificationMapper.selectSpecListBuyId(id);
    }

    @Override
    public String checkSpecNameUnique(String specName) {
        int count = specificationMapper.checkSpecNameUnique(specName);
        if (count> 0){
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    @Override
    public int insertSpecification(Specification specification) {
        int count = 0;
        try {
           specificationMapper.insertSpecification(specification);
            for(SpecificationOption option: specification.getOptions()){
                //specification中有没有id
                //对option进行关联specification
                option.setSpecification(specification);
                specificationOptionMapper.insertOptions(option);
            }
            count=1;
        }catch (Exception e){

        }
        return count;
    }

    @Override
    public int updateSpecification(Specification specification) {
        int count = 0;
        try{
            specificationOptionMapper.deleteSpecOptionBySpecId(specification.getId());
            specificationMapper.updateSpecification(specification);
            for(SpecificationOption option: specification.getOptions()){
                //specification中有没有id
                //对option进行关联specification
                option.setSpecification(specification);
                specificationOptionMapper.insertOptions(option);
            }
            count=1;
        }catch (Exception e){

        }
        return count;
    }

    @Override
    public int deleteSpecificationById(Long specId) {
        int count = 0;
        try {
            specificationOptionMapper.deleteSpecOptionBySpecId(specId);
            specificationMapper.deleteSpecificationById(specId);
            count = 1;
        }catch (Exception e){

        }
        return count;
    }

    @Override
    public int deleteSpecificationByIds(Long[] specIds) {
        int count = 0;
        try {
            specificationOptionMapper.deleteSpecOptionBySpecIds(specIds);
            specificationMapper.deleteSpecificationByIds(specIds);
            count = 1;
        }catch (Exception e){

        }
        return count;
    }

}
