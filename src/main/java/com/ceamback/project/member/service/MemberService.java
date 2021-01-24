package com.ceamback.project.member.service;

import com.ceamback.project.member.domain.Member;

import java.util.List;

public interface MemberService {

    public List<Member> selectList(Member member);

    public Member selectMember(Long id);

    public String checkMemberNameUnique(String memberName);

    public int add(Member member);

    public int edit(Member member);

    public int deleteById(Long id);

    public int deleteByIds(Long[] ids);

}
