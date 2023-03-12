package com.leo.market.promotion;

import java.math.BigDecimal;
import java.util.List;

import com.leo.market.entity.Inventory;

public class ManJianPromotion extends Calculation {

    /**
     * @param base
     * @param cut
     */
    public ManJianPromotion(BigDecimal base, BigDecimal cut) {
        this.base = base;
        this.cut = cut;
    }

    private BigDecimal base;

    private BigDecimal cut;

    public BigDecimal cal(List<Inventory> list) {
        BigDecimal total = super.total(list);
        if (total.compareTo(base) >= 0) {
            total = total.subtract(cut);
        }
        return total;
    }

    /**
     * @param base the base to set
     */
    public void setBase(BigDecimal base) {
        this.base = base;
    }

    /**
     * @param cut the cut to set
     */
    public void setCut(BigDecimal cut) {
        this.cut = cut;
    }

}
