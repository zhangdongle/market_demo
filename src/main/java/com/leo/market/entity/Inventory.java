package com.leo.market.entity;

public class Inventory {

    private Goods goods;

    private Integer count;

    /**
     * @return the goods
     */
    public Goods getGoods() {
        return goods;
    }

    /**
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @param goods the goods to set
     */
    public void setGoods(Goods goods) {
        this.goods = goods;
    }

}
