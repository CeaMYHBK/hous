package com.ceamback.project.system.domain;

import com.ceamback.framework.aspectj.lang.annotation.Excel;
import com.ceamback.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SysCeam extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 角色ID */
    @Excel(name = "序号", cellType = Excel.ColumnType.NUMERIC)
    private Long ceamId;

    /** 角色名称 */
    @Excel(name = "性别")
    private String sex;

    /** 角色权限 */
    @Excel(name = "爱好")
    private String hobb;

    /** 角色排序 */
    @Excel(name = "角色排序")
    private String job;

    /** 角色权限 */
    @Excel(name = "学校")
    private String school;

    /** 角色排序 */
    @Excel(name = "旅游地方")
    private String travel;

    public SysCeam() {
    }

    public SysCeam(Long ceamId) { this.ceamId = ceamId; }

    public static long getSerialVersionUID() { return serialVersionUID; }

    public Long getCeamId() { return ceamId; }

    public void setCeamId(Long ceamId) { this.ceamId = ceamId; }

    public String getSex() { return sex; }

    public void setSex(String sex) { this.sex = sex; }

    public String getHobb() { return hobb; }

    public void setHobb(String hobb) { this.hobb = hobb; }

    public String getJob() { return job; }

    public void setJob(String job) { this.job = job; }

    public String getSchool() { return school; }

    public void setSchool(String school) { this.school = school; }

    public String getTravel() { return travel; }

    public void setTravel(String travel) { this.travel = travel; }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("ceamId", getCeamId())
                .append("sex", getSex())
                .append("hobb", getHobb())
                .append("job", getJob())
                .append("school", getSchool())
                .append("travel", getTravel())
                .toString();
    }
}
