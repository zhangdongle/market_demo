package com.leo.market;

import java.math.BigDecimal;

import com.leo.market.entity.Cashier;
import com.leo.market.entity.Fruit;
import com.leo.market.entity.ShoppingCard;
import com.leo.market.exception.ServiceException;
import com.leo.market.promotion.ManJianPromotion;

/**
 * Hello world!
 *
 */
public class App {

    // 初始化商品信息
    private static Fruit apple = new Fruit("苹果", new BigDecimal(8));
    private static Fruit strawberry = new Fruit("草莓", new BigDecimal(13));
    private static Fruit mongo = new Fruit("芒果", new BigDecimal(20));

    private static Cashier cashier = new Cashier();

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    public static void test1() {
        try {
            ShoppingCard card = new ShoppingCard();
            card.putGoods(apple, 5);
            card.putGoods(strawberry, 2);
            cashier.settle(card);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test2() {
        try {
            ShoppingCard card = new ShoppingCard();
            card.putGoods(apple, 5);
            card.putGoods(strawberry, 2);
            card.putGoods(mongo, 2);
            cashier.settle(card);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test3() {
        try {
            strawberry.setDiscount(new BigDecimal(0.8));
            ShoppingCard card = new ShoppingCard();
            card.putGoods(apple, 5);
            card.putGoods(strawberry, 2);
            card.putGoods(mongo, 2);
            cashier.settle(card);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test4() {
        try {
            ManJianPromotion calculation = new ManJianPromotion(new BigDecimal(100), new BigDecimal(10));
            cashier.setSalesPromotion(calculation);

            ShoppingCard card = new ShoppingCard();
            card.putGoods(apple, 5);
            card.putGoods(strawberry, 2);
            card.putGoods(mongo, 2);
            cashier.settle(card);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
