package com.ceamback.project.member.service.impl;

import com.ceamback.common.constant.UserConstants;
import com.ceamback.project.member.domain.MemberLevel;
import com.ceamback.project.member.mapper.MemberLevelMapper;
import com.ceamback.project.member.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberLevelServiceImpl implements MemberLevelService {

    @Autowired
    private MemberLevelMapper memberLevelMapper;

    @Override
    public List<MemberLevel> selectMemberLevelList(MemberLevel memberLevel) {
        return memberLevelMapper.selectMemberLevelList(memberLevel);
    }

    @Override
    public MemberLevel selectMemberLevelById(Long id) {
        return memberLevelMapper.selectMemberLevelById(id);
    }

    @Override
    public String checkLevelNameUnique(String levelName) {
        int count = memberLevelMapper.checkLevelNameUnique(levelName);
        if (count >0){
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    @Override
    public int addMemberLevel(MemberLevel memberLevel) {
        return memberLevelMapper.addMemberLevel(memberLevel);
    }

    @Override
    public int editMemberLevel(MemberLevel memberLevel) {
        return memberLevelMapper.editMemberLevel(memberLevel);
    }

    @Override
    public int deleteMemberLevelById(Long id) {
        return memberLevelMapper.deleteMemberLevelById(id);
    }

    @Override
    public int deleteMemberLevelByIds(Long[] ids) {
        return memberLevelMapper.deleteMemberLevelByIds(ids);
    }
}
