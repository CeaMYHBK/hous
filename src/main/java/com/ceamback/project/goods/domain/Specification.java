package com.ceamback.project.goods.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class Specification {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String specName;

    public Specification() {
    }

    public Specification(Long id, String specName) {
        this.id = id;
        this.specName = specName;
    }

    private List<SpecificationOption> options;

    public Long getId() {
        return id;
    }

    public void setSpecId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "规格名称不能为空")
    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public List<SpecificationOption> getOptions() {
        return options;
    }

    public void setOptions(List<SpecificationOption> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return  new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("specName", getSpecName())
                .append("options", getOptions())
                .toString();
    }
}
