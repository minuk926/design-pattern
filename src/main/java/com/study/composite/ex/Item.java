package com.study.composite.ex;

// Leaf 객체
class Item implements ItemComponent {
    String name; // 아이템 이름
    int price; // 아이템 가격

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}