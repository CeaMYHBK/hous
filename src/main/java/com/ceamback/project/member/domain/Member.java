package com.ceamback.project.member.domain;

import com.ceamback.framework.web.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

public class Member extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String memberName;
    private int sex;

    //@DateTimeFormat(pattern = "yyyy-MM-dd'T' HH:mm:ss'Z'")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date birthday;
    private Long levelId;
    private String levelName;
    private String weiXin;
    private String telNumber;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "会员名称不能为空")
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Past(message = "生日必须为过去时")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

   //NotBlank不能作用在Long上面
    @NotNull(message = "等级不能为空")
    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getWeiXin() {
        return weiXin;
    }

    public void setWeiXin(String weiXin) {
        this.weiXin = weiXin;
    }

    @NotBlank(message = "手机号不能为空")
    @Size(min = 11,max = 11,message = "手机号码为11位数字")
    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("levelName", getLevelName())
                .append("memberName", getMemberName())
                .append("sex", getSex())
                .append("birthday", getBirthday())
                .append("levelId", getLevelId())
                .append("weiXin", getWeiXin())
                .append("telNumber", getTelNumber())
                .toString();
    }
}
