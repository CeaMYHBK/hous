package com.ceamback.project.purchase.service;

import com.ceamback.project.purchase.domain.Apply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 采购申请service接口
 */
public interface IApplyService {

    public List<Apply> selectList();

    public Apply selectById(@Param("id") Integer id);

    public int insert(Apply apply);

    public int update(Apply apply);

    public int deleteById(Integer id);

    public int deleteByIds(Integer[] ids);
}
