package com.swagger3.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

//@Schema(title = "商品模型")
@ApiModel("商品模型")
public class Goods {
    //商品id
    //@Schema(title = "商品id")
    @ApiModelProperty("商品id")
    Long goodsId;
    public Long getGoodsId() {
        return this.goodsId;
    }
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    //商品名称
    //@Schema(title = "商品名称")
    @ApiModelProperty("商品名称")
    private String goodsName;
    public String getGoodsName() {
        return this.goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    //商品标题
    //@Schema(title = "商品标题")
    @ApiModelProperty("商品标题")
    private String subject;
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //商品价格
    //@Schema(title = "商品价格")
    @ApiModelProperty("商品价格")
    private BigDecimal price;
    public BigDecimal getPrice() {
        return this.price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    //库存
    //@Schema(title = "库存")
    @ApiModelProperty("商品库存")
    int stock;
    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public String toString(){
        return " Goods:goodsId=" + goodsId +" goodsName=" + goodsName+" subject=" + subject+" price=" + price+" stock=" + stock;
    }
}
