package com.leo.market.promotion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.leo.market.entity.Goods;
import com.leo.market.entity.Inventory;

public class Calculation {
    public BigDecimal total(List<Inventory> list) {
        BigDecimal total = BigDecimal.ZERO;
        for (Inventory inventory : list) {
            Goods goods = inventory.getGoods();
            BigDecimal amount = goods.getPrice().multiply(new BigDecimal(inventory.getCount()))
                    .multiply(goods.getDiscount()).setScale(2, RoundingMode.HALF_UP);
            total = total.add(amount);
        }
        return total;
    }

    public BigDecimal cal(List<Inventory> list) {
        return total(list);
    }
}
