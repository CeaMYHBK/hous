package com.ceamback.project.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;

public class MemberLevel {

    private static final long serialVersionUID = 1L;

    //
    private Long levelId;
    //
    private String levelName;
    //
    private String description;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    @NotBlank(message = "等级不能为空")
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("levelId", getLevelId())
                .append("levelName", getLevelName())
                .append("description", getDescription())
                .toString();
    }
}
