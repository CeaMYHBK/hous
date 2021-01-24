package com.ceamback.project.ck.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.ck.domain.Definition;
import com.ceamback.project.ck.service.IDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ck/definition") //url命名规则：/模块/子模块
public class DefinitionController extends BaseController {

    @Autowired
    private IDefinitionService definitionService;

    @GetMapping("list")
    public TableDataInfo list(Definition definition){
        startPage();
        List<Definition> list = definitionService.selectList();
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectById(@PathVariable Integer id){
        return AjaxResult.success(definitionService.selectById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Definition definition){
        return toAjax(definitionService.insert(definition));
    }

    @PutMapping
    public AjaxResult update(@RequestBody Definition definition){
        return toAjax(definitionService.update(definition));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids){
        return toAjax(definitionService.deleteByIds(ids));
    }
}
