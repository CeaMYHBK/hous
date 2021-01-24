package com.ceamback.project.member.mapper;

import com.ceamback.project.member.domain.MemberLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberLevelMapper {

    public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel);

    public MemberLevel selectMemberLevelById(@Param("id") Long id);

    public int checkLevelNameUnique(String levelName);

    public int addMemberLevel(MemberLevel memberLevel);

    public int editMemberLevel(MemberLevel memberLevel);

    public int deleteMemberLevelById(@Param("id") Long id);

    public int deleteMemberLevelByIds(Long[] ids);
}
