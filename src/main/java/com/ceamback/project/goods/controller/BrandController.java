package com.ceamback.project.goods.controller;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.goods.domain.Brand;
import com.ceamback.project.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods/brand")
public class BrandController extends BaseController {

    @Autowired
    private BrandService brandService;

    @GetMapping("list")
    public TableDataInfo list(Brand brand){
        startPage();
        List<Brand> list = brandService.selectBrandList(brand);
        return getDataTable(list);
    }

    @GetMapping("/{brandId}")
    public AjaxResult selectById(@PathVariable Long brandId){
        return AjaxResult.success(brandService.selectBrandById(brandId));
    }

    @PostMapping
    public AjaxResult add(@Validated @RequestBody Brand brand){
        if (UserConstants.NOT_UNIQUE.equals(brandService.checkBrandNameUnique(brand.getBrandName()))){
            return AjaxResult.error("新增品牌'" + brand.getBrandName() + "失败，品牌名称已存在");
        }
        return toAjax(brandService.insertBrand(brand));
    }

    @PutMapping
    public AjaxResult update(@Validated @RequestBody Brand brand){
        //if (UserConstants.NOT_UNIQUE.equals(brandService.checkBrandNameUnique(brand.getBrandName()))){
           // return AjaxResult.error("修改品牌'"+brand.getBrandName()+"失败，品牌名称已存在");
       // }
        return toAjax(brandService.updateBrand(brand));
    }

    @DeleteMapping("/{brandIds}")
    public AjaxResult remove(@PathVariable Long[] brandIds){
        return toAjax(brandService.deleteBrandByIds(brandIds));
    }
}
