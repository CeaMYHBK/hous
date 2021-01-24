package com.ceamback.project.member.service;

import com.ceamback.project.member.domain.MemberLevel;

import java.util.List;

public interface MemberLevelService {

    public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel);

    public MemberLevel selectMemberLevelById(Long memberLevel);

    public String checkLevelNameUnique(String levelName);

    public int addMemberLevel(MemberLevel memberLevel);

    public int editMemberLevel(MemberLevel memberLevel);

    public int deleteMemberLevelById(Long id);

    public int deleteMemberLevelByIds(Long[] ids);
}
