package com.ceamback.project.goods.mapper;

import com.ceamback.project.goods.domain.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {

    public List<Brand> selectBrandList(Brand brand);

    public Brand selectBrandById(@Param("brandId") Long brandId);

    public int insertBrand(Brand brand);

    public int updateBrand(Brand brand);

    public int checkBrandNameUnique(String brandName);

    public int deleteBrandById(Long brandId);

    public int deleteBrandByIds(Long[] brandIds);
}
