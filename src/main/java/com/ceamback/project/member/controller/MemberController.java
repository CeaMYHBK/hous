package com.ceamback.project.member.controller;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.member.domain.Member;
import com.ceamback.project.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/member")
public class MemberController extends BaseController {

    @Autowired
    private MemberService memberService;

    @GetMapping("list")
    public TableDataInfo list(Member member){
        startPage();
        List<Member> list=memberService.selectList(member);
        return getDataTable(list);
    }

    @GetMapping("/{id}")
    public AjaxResult selectMember(@PathVariable Long id){
        return AjaxResult.success(memberService.selectMember(id));
    }

    @PostMapping
    public AjaxResult add(@Validated @RequestBody Member member){
        if (UserConstants.NOT_UNIQUE.equals(memberService.checkMemberNameUnique(member.getMemberName()))) {
            return AjaxResult.error("新增会员'" + member.getMemberName() + "'失败,会员名称已存在");
        }
        return toAjax(memberService.add(member));
    }

    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Member member){
        if (UserConstants.NOT_UNIQUE.equals(memberService.checkMemberNameUnique(member.getMemberName()))) {
            return AjaxResult.error("修改会员'" + member.getMemberName() + "'失败,会员名称已存在");
        }
        return toAjax(memberService.edit(member));
    }

    @DeleteMapping("/{ids}")
    public AjaxResult delete(@PathVariable Long[] ids){
        return toAjax(memberService.deleteByIds(ids));
    }
}
