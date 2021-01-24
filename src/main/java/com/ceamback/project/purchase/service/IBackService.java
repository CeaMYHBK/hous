package com.ceamback.project.purchase.service;

import com.ceamback.project.purchase.domain.Back;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 采购退货service接口
 */
public interface IBackService {

    public List<Back> selectList();

    public Back selectById(@Param("id") Integer id);

    public int insert(Back back);

    public int update(Back back);

    public int deleteById(Integer id);

    public int deleteByIds(Integer[] ids);
}
