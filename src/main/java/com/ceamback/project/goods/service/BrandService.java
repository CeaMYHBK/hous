package com.ceamback.project.goods.service;

import com.ceamback.project.goods.domain.Brand;

import java.util.List;

public interface BrandService {

    public List<Brand> selectBrandList(Brand brand);

    public Brand selectBrandById(Long brandId);

    public int insertBrand(Brand brand);

    public int updateBrand(Brand brand);

    public String checkBrandNameUnique(String brandName);

    public int deleteBrandById(Long brandId);

    public int deleteBrandByIds(Long[] brandIds);
}
