package com.leo.market.entity;

import java.math.BigDecimal;

import com.leo.market.promotion.Calculation;

/**
 * 结算
 */
public class Cashier {

    private Calculation calculation = new Calculation();

    public synchronized void setSalesPromotion(Calculation calculation) {
        this.calculation = calculation;
    }

    public void settle(ShoppingCard shoppingCard) {
        BigDecimal amount = calculation.cal(shoppingCard.getInventoryList());
        System.out.println("顾客购买了：");
        System.out.println("\t名称\t单价\t数量");
        for (Inventory item : shoppingCard.getInventoryList()) {
            System.out.println(
                    "\t" + item.getGoods().getName() + "\t" + item.getGoods().getPrice() + "\t" + item.getCount());
        }
        System.out.println("总计（含优惠）：" + amount);
    }
}
