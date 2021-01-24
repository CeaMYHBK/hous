package com.ceamback.project.ck.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.ck.domain.In;
import com.ceamback.project.ck.service.IInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ck/in") //url命名规则：/模块/子模块
public class InController extends BaseController {

    @Autowired
    private IInService inService;

    @GetMapping("list")
    public TableDataInfo list(In in){
        startPage();
        List<In> list = inService.selectList();
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectById(@PathVariable Integer id){
        return AjaxResult.success(inService.selectById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody In in){
        return toAjax(inService.insert(in));
    }

    @PutMapping
    public AjaxResult update(@RequestBody In in){
        return toAjax(inService.update(in));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids){
        return toAjax(inService.deleteByIds(ids));
    }
}
