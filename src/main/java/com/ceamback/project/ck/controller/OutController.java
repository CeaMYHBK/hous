package com.ceamback.project.ck.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.ck.domain.Out;
import com.ceamback.project.ck.service.IOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ck/out") //url命名规则：/模块/子模块
public class OutController extends BaseController {

    @Autowired
    private IOutService outService;

    @GetMapping("list")
    public TableDataInfo list(Out out){
        startPage();
        List<Out> list = outService.selectList();
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectById(@PathVariable Integer id){
        return AjaxResult.success(outService.selectById(id));
    }

    @PostMapping
    public AjaxResult add(@RequestBody Out out){
        return toAjax(outService.insert(out));
    }

    @PutMapping
    public AjaxResult update(@RequestBody Out out){
        return toAjax(outService.update(out));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids){
        return toAjax(outService.deleteByIds(ids));
    }
}
