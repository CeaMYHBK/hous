package com.ceamback.project.system.service;

import com.ceamback.project.system.domain.SysCeam;

import java.util.List;

public interface ISysCeamService {

    /**
     * 根据条件分页查询数据
     *
     * @param ceam 信息
     * @return 数据集合信息
     */
    public List<SysCeam> selectCeamList(SysCeam ceam);

    /**
     * 通过ID查询角色
     *
     * @param ceamId ID
     * @return 对象信息
     */
    public SysCeam selectCeamById(Long ceamId);

    /**
     * 修改信息
     *
     * @param ceam 信息
     * @return 结果
     */
    public int updateCeam(SysCeam ceam);

    /**
     * 新增信息
     *
     * @param ceam 信息
     * @return 结果
     */
    public int insertCeam(SysCeam ceam);

    /**
     * 通过ID删除
     *
     * @param ceamId ID
     * @return 结果
     */
    public int deleteCeamById(Long ceamId);

    /**
     * 批量删除信息
     *
     * @param ceamIds 需要删除的ID
     * @return 结果
     */
    public int deleteCeamByIds(Long[] ceamIds);
}
