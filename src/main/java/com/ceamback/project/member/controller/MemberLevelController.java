package com.ceamback.project.member.controller;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.member.domain.MemberLevel;
import com.ceamback.project.member.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/level")
public class MemberLevelController extends BaseController {

    @Autowired
    private MemberLevelService memberLevelService;

    @GetMapping("list")
    public TableDataInfo list(MemberLevel memberLevel){
        startPage();
        List<MemberLevel> list=memberLevelService.selectMemberLevelList(memberLevel);
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectMemberLevelById(@PathVariable Long id){
        return AjaxResult.success(memberLevelService.selectMemberLevelById(id));
    }

    @PostMapping
    public AjaxResult add(@Validated @RequestBody MemberLevel memberLevel){
        if (UserConstants.NOT_UNIQUE.equals(memberLevelService.checkLevelNameUnique(memberLevel.getLevelName()))){
            return AjaxResult.error("新增等级'" + memberLevel.getLevelName() + "'失败，已存在");
        }
        return toAjax(memberLevelService.addMemberLevel(memberLevel));
    }

    @PutMapping
    public AjaxResult edit(@Validated @RequestBody MemberLevel memberLevel){
        return toAjax(memberLevelService.editMemberLevel(memberLevel));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult delete(@PathVariable Long[]  ids){
        return toAjax(memberLevelService.deleteMemberLevelByIds(ids));
    }
}
