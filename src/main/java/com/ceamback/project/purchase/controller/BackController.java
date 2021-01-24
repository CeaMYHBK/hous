package com.ceamback.project.purchase.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.purchase.domain.Back;
import com.ceamback.project.purchase.service.IBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 采购退货控制层
 */
@RestController
@RequestMapping("/purchase/back") //url命名规则：/模块/子模块
public class BackController extends BaseController {

    @Autowired
    private IBackService backService;

    @GetMapping("list")
    public TableDataInfo list(Back back){
        startPage();
        List<Back> list = backService.selectList();
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectById(@PathVariable Integer id){
        return AjaxResult.success(backService.selectById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Back back){
        return toAjax(backService.insert(back));
    }

    @PutMapping
    public AjaxResult update(@RequestBody Back back){
        return toAjax(backService.update(back));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids){
        return toAjax(backService.deleteByIds(ids));
    }
}
