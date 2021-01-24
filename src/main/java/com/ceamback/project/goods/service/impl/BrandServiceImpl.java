package com.ceamback.project.goods.service.impl;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.project.goods.domain.Brand;
import com.ceamback.project.goods.mapper.BrandMapper;
import com.ceamback.project.goods.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    private static final Logger log = LoggerFactory.getLogger(BrandServiceImpl.class);

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> selectBrandList(Brand brand) {
        return brandMapper.selectBrandList(brand);
    }

    @Override
    public Brand selectBrandById(Long brandId) {
        return brandMapper.selectBrandById(brandId);
    }

    @Override
    public int insertBrand(Brand brand) {
        return brandMapper.insertBrand(brand);
    }

    @Override
    public int updateBrand(Brand brand) {
        return brandMapper.updateBrand(brand);
    }

    @Override
    public String checkBrandNameUnique(String brandName) {
        int count = brandMapper.checkBrandNameUnique(brandName);

        if (count > 0)
        {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    @Override
    public int deleteBrandById(Long brandId) {
        return brandMapper.deleteBrandById(brandId);
    }

    @Override
    public int deleteBrandByIds(Long[] brandIds) {
        return brandMapper.deleteBrandByIds(brandIds);
    }
}
