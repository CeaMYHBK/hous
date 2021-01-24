package com.ceamback.project.goods.domain;

import com.ceamback.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Brand extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long brandId;

    private String brandName;

    private String brandPic;

    private String brief;

    private Integer isNew;

    private Integer seq;

    private Integer status;

    private String firstChar;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @NotBlank(message="品牌名称不能为空")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandPic() {
        return brandPic;
    }

    public void setBrandPic(String brandPic) {
        this.brandPic = brandPic;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Size(max = 1,message = "首字母只能是一个字母")
    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("brandId", getBrandId() )
                .append("brandName", getBrandName())
                .append("brandPic", getBrandPic())
                .append("brief", getBrief())
                .append("isNew", getIsNew())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("seq", getSeq())
                .append("status", getStatus())
                .append("firstChar", getFirstChar())
                .toString();
    }
}
