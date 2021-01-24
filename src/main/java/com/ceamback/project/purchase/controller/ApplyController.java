package com.ceamback.project.purchase.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.purchase.domain.Apply;
import com.ceamback.project.purchase.service.IApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 采购申请控制类
 */
@RestController
@RequestMapping("/purchase/apply") //url命名规则：/模块/子模块
public class ApplyController extends BaseController {

    @Autowired
    private IApplyService applyService;

    @GetMapping("list")
    public TableDataInfo list(Apply apply){
        startPage();
        List<Apply> list = applyService.selectList();
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectById(@PathVariable Integer id){
        return AjaxResult.success(applyService.selectById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Apply apply){
        return toAjax(applyService.insert(apply));
    }

    @PutMapping
    public AjaxResult update(@RequestBody Apply apply){
        return toAjax(applyService.update(apply));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids){
        return toAjax(applyService.deleteByIds(ids));
    }
}
