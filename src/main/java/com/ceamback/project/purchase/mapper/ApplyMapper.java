package com.ceamback.project.purchase.mapper;

import com.ceamback.project.purchase.domain.Apply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 采购申请dao接口
 */
public interface ApplyMapper {

    public List<Apply> selectList();

    public Apply selectById(@Param("id") Integer id);

    public int insert(Apply apply);

    public int update(Apply apply);

    public int deleteById(Integer id);

    public int deleteByIds(Integer[] ids);
}
