package com.ceamback.project.goods.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Type {
    private static final long serialVersionUID = 1L;

    private Long typeId;

    private String typeName;

    private String enable;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @NotBlank(message="属性类别不能为空")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Size(max = 1,message = "是否可用只能填一个数字")
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("typeId", getTypeId())
                .append("typeName", getTypeName())
                .append("enable", getEnable())
                .toString();
    }
}
