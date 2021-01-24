package com.ceamback.project.purchase.mapper;

import com.ceamback.project.purchase.domain.Back;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 采购退货dao接口
 */
public interface BackMapper {

    public List<Back> selectList();

    public Back selectById(@Param("id") Integer id);

    public int insert(Back back);

    public int update(Back back);

    public int deleteById(Integer id);

    public int deleteByIds(Integer[] ids);
}
