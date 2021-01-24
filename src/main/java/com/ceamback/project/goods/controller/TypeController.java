package com.ceamback.project.goods.controller;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.goods.domain.Type;
import com.ceamback.project.goods.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods/type")
public class TypeController extends BaseController {

    @Autowired
    private TypeService typeService;

    @GetMapping("list")
    public TableDataInfo list(Type type){
        startPage();
        List<Type> list=typeService.selectTypeList(type);
        return getDataTable(list);
    }

    @GetMapping("/{typeId}")
    public AjaxResult listById(@PathVariable Long typeId){
        return AjaxResult.success(typeService.selectTypeById(typeId));
    }

    @PostMapping
    public AjaxResult add(@Validated @RequestBody Type type){
        if (UserConstants.NOT_UNIQUE.equals(typeService.checkTypeNameUnique(type.getTypeName()))){
            return AjaxResult.error("新增属性类别'" + type.getTypeName() + "'失败，类别名称已存在");
        }
        return toAjax(typeService.insertType(type));
    }

    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Type type){
        return toAjax(typeService.updateType(type));
    }

    @DeleteMapping("/{typeIds}")
    public AjaxResult delete(@PathVariable Long[] typeIds){
        return toAjax(typeService.deleteTypeByIds(typeIds));
    }
}
