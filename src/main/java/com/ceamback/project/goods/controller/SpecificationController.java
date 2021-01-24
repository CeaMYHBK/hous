package com.ceamback.project.goods.controller;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.goods.domain.Specification;
import com.ceamback.project.goods.domain.SpecificationOption;
import com.ceamback.project.goods.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods/specification")
public class SpecificationController extends BaseController {

    @Autowired
    private SpecificationService specificationService;

   @GetMapping("list")
   public TableDataInfo list(Specification specification){
       startPage();
       List<Specification> list = specificationService.selectSpecificationList(specification);
       return getDataTable(list);
   }

   @GetMapping(value = "/{specId}")
   public AjaxResult listById(@PathVariable("specId") Long specId){
       //List<Specification> list = specificationService.selectSpecListBuId(id);
       return AjaxResult.success(specificationService.selectSpecListBuyId(specId));
   }

    @PostMapping
    public AjaxResult add(@Validated @RequestBody Specification specification){
       if (UserConstants.NOT_UNIQUE.equals(specificationService.checkSpecNameUnique(specification.getSpecName()))){
           return AjaxResult.error("新增规格'" + specification.getSpecName() + "'失败，规格名称已存在");
       }
        return toAjax(specificationService.insertSpecification(specification));
    }

    @PutMapping
    public AjaxResult update(@Validated @RequestBody Specification specification){
       return toAjax(specificationService.updateSpecification(specification));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult delete(@PathVariable Long[] ids){
       return toAjax(specificationService.deleteSpecificationByIds(ids));
    }


}
