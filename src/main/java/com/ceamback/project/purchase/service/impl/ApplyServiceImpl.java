package com.ceamback.project.purchase.service.impl;

import com.ceamback.common.utils.SecurityUtils;
import com.ceamback.project.purchase.domain.Apply;
import com.ceamback.project.purchase.mapper.ApplyMapper;
import com.ceamback.project.purchase.service.IApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 采购申请service实现层
 */
@Service
public class ApplyServiceImpl implements IApplyService {

    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public List<Apply> selectList() {
        return applyMapper.selectList();
    }

    @Override
    public Apply selectById(Integer id) {
        return applyMapper.selectById(id);
    }

    @Override
    public int insert(Apply apply) {
        apply.setCreateBy(SecurityUtils.getUsername());
        return applyMapper.insert(apply);
    }

    @Override
    public int update(Apply apply) {
        return applyMapper.update(apply);
    }

    @Override
    public int deleteById(Integer id) {
        return applyMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Integer[] ids) {
        return applyMapper.deleteByIds(ids);
    }
}
