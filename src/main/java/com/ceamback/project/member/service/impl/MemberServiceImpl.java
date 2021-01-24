package com.ceamback.project.member.service.impl;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.project.member.domain.Member;
import com.ceamback.project.member.mapper.MemberMapper;
import com.ceamback.project.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> selectList(Member member) {
        return memberMapper.selectList(member);
    }

    @Override
    public Member selectMember(Long id) {
        return memberMapper.selectMember(id);
    }

    @Override
    public String checkMemberNameUnique(String memberName) {
        int count = memberMapper.checkMemberNameUnique(memberName);
        if(count >0){
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    @Override
    public int add(Member member) {
        return memberMapper.add(member);
    }

    @Override
    public int edit(Member member) {
        return memberMapper.edit(member);
    }

    @Override
    public int deleteById(Long id) {
        return memberMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Long[] ids) {
        return memberMapper.deleteByIds(ids);
    }
}
