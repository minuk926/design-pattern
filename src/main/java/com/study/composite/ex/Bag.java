package com.study.composite.ex;

import java.util.*;

// Composite 객체
class Bag implements ItemComponent {
    // 아이템들과 서브 가방 모두를 저장하기 위해 인터페이스 타입 리스트로 관리
    List<ItemComponent> components = new ArrayList<>();

    String name; // 가방 이름

    public Bag(String name) {
        this.name = name;
    }

    // 리스트에 아이템 & 가방 추가
    public void add(ItemComponent item) {
        components.add(item); 
    }

    // 현재 가방의 내용물을 반환
    public List<ItemComponent> getComponents() {
        return components; 
    }

    @Override
    public int getPrice() {
        int sum = 0;

        for (ItemComponent component : components) {
            // 만일 리스트에서 가져온 요소가 Item이면 정수값을 받을 것이고, Bag이면 '재귀 함수' 동작이 되게 된다 ☆
            sum += component.getPrice(); // 자기 자신 호출(재귀)
        }

        return sum; // 그렇게 재귀적으로 돌아 하위 아이템들의 값을 더하고 반환하게 된다.
    }

    @Override
    public String getName() {
        return name;
    }
}