package com.study.strategy;

import java.util.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : ShoppingCart
 * author      : limju
 * date        : 2024 11월 07
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 07   limju       최초 생성
 *
 * </pre>
 */
public class ShoppingCart {
    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    // FIXME: 결제 방법은 인수로 결제 알고리즘을 필요로 하며 인스턴스 변수로 어디에도 저장하지 않는다
    public void pay(IPaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
