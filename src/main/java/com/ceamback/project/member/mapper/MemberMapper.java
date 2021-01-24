package com.ceamback.project.member.mapper;

import com.ceamback.project.member.domain.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberMapper {

    public List<Member> selectList(Member member);

    public Member selectMember(@Param("id") Long id);

    public int checkMemberNameUnique(String memberName);

    public int add(Member member);

    public int edit(Member member);

    public int deleteById(@Param("id") Long id);

    public int deleteByIds(Long[] ids);
}
