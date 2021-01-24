package com.ceamback.project.goods.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;

public class SpecificationOption {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String optionName;

    private Specification specification;

    public SpecificationOption() {
    }

    public SpecificationOption(Long id, String optionName, Specification specification) {
        this.id = id;
        this.optionName = optionName;
        this.specification = specification;
    }

    public Long getOptionId() {
        return id;
    }

    public void setOptionId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "规格属性值不能为空")
    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("optionId", getOptionId())
                .append("optionName", getOptionName())
                .append("specification", getSpecification())
                .toString();
    }
}
