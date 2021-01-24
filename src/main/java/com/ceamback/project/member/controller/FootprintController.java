package com.ceamback.project.member.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.member.domain.Footprint;
import com.ceamback.project.member.service.FootprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/footprint")
public class FootprintController extends BaseController {

    @Autowired
    private FootprintService footprintService;

    @GetMapping("/list")
    public TableDataInfo list(Footprint footprint){
        startPage();
        List<Footprint> list=footprintService.selectFootprintList(footprint);
        return getDataTable(list);
    }

    @DeleteMapping("/{ids}")
    public AjaxResult delete(@PathVariable Long[] ids){
        return toAjax(footprintService.deleteByIds(ids));
    }
}
