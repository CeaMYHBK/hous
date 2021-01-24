package com.ceamback.project.system.controller;

import com.ceamback.common.utils.poi.ExcelUtil;
import com.ceamback.framework.aspectj.lang.annotation.Log;
import com.ceamback.framework.aspectj.lang.enums.BusinessType;
import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.system.domain.SysCeam;
import com.ceamback.project.system.service.ISysCeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/ceam")
public class SysCeamController extends BaseController {

    @Autowired
    private ISysCeamService ceamService;

    @PreAuthorize("@ss.hasPermi('system:ceam:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCeam ceam)
    {
        startPage();
        List<SysCeam> list = ceamService.selectCeamList(ceam);
        return getDataTable(list);
    }

    @Log(title = "ceam", businessType = BusinessType.EXPORT)
    @PreAuthorize("@ss.hasPermi('system:ceam:export')")
    @GetMapping("/export")
    public AjaxResult export(SysCeam ceam)
    {
        List<SysCeam> list = ceamService.selectCeamList(ceam);
        ExcelUtil<SysCeam> util = new ExcelUtil<SysCeam>(SysCeam.class);
        return util.exportExcel(list, "Ceam数据");
    }

    /**
     * 根据角色编号获取详细信息
     */
   // @PreAuthorize("@ss.hasPermi('system:ceam:query')")
    @GetMapping(value = "/{ceamId}")
    public AjaxResult getInfo(@PathVariable Long ceamId)
    {
        return AjaxResult.success(ceamService.selectCeamById(ceamId));
    }

    /**
     * 新增角色
     */
    @PreAuthorize("@ss.hasPermi('system:ceam:add')")
    @Log(title = "ceam", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysCeam ceam)
    {
        return toAjax(ceamService.insertCeam(ceam));

    }

    /**
     * 修改保存角色
     */
    //@PreAuthorize("@ss.hasPermi('system:ceam:edit')")
   // @Log(title = "角色", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SysCeam ceam)
    {
        return toAjax(ceamService.updateCeam(ceam));
    }

    /**
     * 删除角色
     */
    @PreAuthorize("@ss.hasPermi('system:ceam:remove')")
    @Log(title = "ceam", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ceamIds}")
    public AjaxResult remove(@PathVariable Long[] ceamIds)
    {
        return toAjax(ceamService.deleteCeamByIds(ceamIds));
    }
}
