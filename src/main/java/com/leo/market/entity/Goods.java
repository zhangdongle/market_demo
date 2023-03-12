package com.leo.market.entity;

import java.math.BigDecimal;

public class Goods {
    // 名称
    private String name;

    // 价格
    private BigDecimal price;

    // 折扣
    private BigDecimal discount = BigDecimal.ONE;

    /**
     * @param name
     * @param price
     */
    public Goods(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return the discount
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

}
