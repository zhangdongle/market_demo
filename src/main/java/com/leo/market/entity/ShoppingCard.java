package com.leo.market.entity;

import java.util.ArrayList;
import java.util.List;

import com.leo.market.exception.ServiceException;

/**
 * 购物车类
 */
public class ShoppingCard {

    private List<Inventory> inventoryList = new ArrayList<>();

    public void putGoods(Goods goods, Integer count) throws ServiceException {
        if (count <= 0) {
            throw new ServiceException("水果斤数为大于等于 0 的整数");
        }
        Inventory inventory = new Inventory();
        inventory.setCount(count);
        inventory.setGoods(goods);
        inventoryList.add(inventory);
    }

    /**
     * @return the inventorys
     */
    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

}
