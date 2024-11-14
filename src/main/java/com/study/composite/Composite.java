package com.study.composite;

import java.util.*;

class Composite implements Component {

    // Leaf 와 Composite 객체 모두를 저장하여 관리하는 내부 리스트
    List<Component> components = new ArrayList<>();

    public void add(Component c) {
        components.add(c); // 리스트 추가
    }

    public void remove(Component c) {
        components.remove(c); // 리스트 삭제
    }

    @Override
    public void operation() {
        System.out.println(this + " 호출");
        
        // 내부 리스트를 순회하여, 단일 Leaf이면 값을 출력하고,
        // 또다른 서브 복합 객체이면, 다시 그 내부를 순회하는 재귀 함수 동작이 된다.
        for (Component component : components) {
            component.operation(); // 자기 자신을 호출(재귀)
        }
    }
    
    public List<Component> getChild() {
        return components;
    }
}