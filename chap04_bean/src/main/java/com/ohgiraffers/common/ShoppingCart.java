package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>(); // 초기화
    }

    public void addItem(Product item){
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}
