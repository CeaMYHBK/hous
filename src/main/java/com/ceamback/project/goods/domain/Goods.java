package com.ceamback.project.goods.domain;

import com.ceamback.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

public class Goods extends BaseEntity {
    private static final long serialVersionUID = 1L;

    //主键
    private Long id;
    //商品类型Id
    private Long categoryId;
    //商品序列号
    private String goodsSn;
    //名称
    private String goodsName;
    //品牌Id
    private Long brandId;

    private Long typeId;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    //关键字
    private String keywords;
    //简明介绍
    private String brief;
    //商品描述
    private String goodsDesc;
    //上架
    private String status;
    //专柜价格
    private BigDecimal oriPrice;
    //附加价格
    private BigDecimal price;
    //是否新商品
    private Integer isNew;
    //商品单位
    private String goodsUnit;
    //商品主图
    private String pic;
    //商品列表图
    private String img;

    private Integer totalStocks;
    //销售量
    private Integer soldNum;
    //主sku　product_id
    private Integer primaryProductId;
    //单位价格，单价
    private BigDecimal unitPrice;
    //热销
    private Integer isHot;
    //市场价
    private BigDecimal marketPrice;
    /**
     * 用户ID
     */
    private Long createUserId;
    /**
     * 用户ID
     */
    private Long createUserDeptId;
    /**
     * 用户ID
     */
    private Long updateUserId;

    /**
     * 翻译用字段
     */
    //商品类型
    private String categoryName;
    //属性类别
    private String typeName;
    //品牌
    private String brandName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getOriPrice() {
        return oriPrice;
    }

    public void setOriPrice(BigDecimal oriPrice) {
        this.oriPrice = oriPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getTotalStocks() {
        return totalStocks;
    }

    public void setTotalStocks(Integer totalStocks) {
        this.totalStocks = totalStocks;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Integer getPrimaryProductId() {
        return primaryProductId;
    }

    public void setPrimaryProductId(Integer primaryProductId) {
        this.primaryProductId = primaryProductId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getCreateUserDeptId() {
        return createUserDeptId;
    }

    public void setCreateUserDeptId(Long createUserDeptId) {
        this.createUserDeptId = createUserDeptId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("categoryId", getCategoryId())
                .append("goodsSn", getGoodsSn())
                .append("goodsName", getGoodsName())
                .append("brandId", getBrandId())
                .append("typeId", getTypeId())
                .append("keywords", getKeywords())
                .append("brief", getBrief())
                .append("goodsDesc", getGoodsDesc())
                .append("status", getStatus())
                .append("oriPrice", getOriPrice())
                .append("price", getPrice())
                .append("isNew", getIsNew())
                .append("goodsUnit", getGoodsUnit())
                .append("pic", getPic())
                .append("img", getImg())
                .append("totalStocks", getTotalStocks())
                .append("soldNum", getSoldNum())
                .append("primaryProductId", getPrimaryProductId())
                .append("unitPrice", getUnitPrice())
                .append("isHot", getIsHot())
                .append("marketPrice", getMarketPrice())
                .append("createUserId=", getCreateUserId())
                .append("createUserDeptId", getCreateUserDeptId())
                .append("updateUserId", getUpdateUserId())
                .append("categoryName", getCategoryName())
                .append("typeName", getTypeName())
                .append("brandName", getBrandName())
                .toString();
    }
}
