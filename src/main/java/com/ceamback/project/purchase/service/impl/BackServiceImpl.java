package com.ceamback.project.purchase.service.impl;

import com.ceamback.common.utils.SecurityUtils;
import com.ceamback.project.purchase.domain.Back;
import com.ceamback.project.purchase.mapper.BackMapper;
import com.ceamback.project.purchase.service.IBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 采购退货service实现层
 */
@Service
public class BackServiceImpl implements IBackService {

    @Autowired
    private BackMapper backMapper;

    @Override
    public List<Back> selectList() {
        return backMapper.selectList();
    }

    @Override
    public Back selectById(Integer id) {
        return backMapper.selectById(id);
    }

    @Override
    public int insert(Back back) {
        back.setCreateBy(SecurityUtils.getUsername());
        return backMapper.insert(back);
    }

    @Override
    public int update(Back back) {
        return backMapper.update(back);
    }

    @Override
    public int deleteById(Integer id) {
        return backMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(Integer[] ids) {
        return backMapper.deleteByIds(ids);
    }
}
