package com.study.composite;

class Client {
    public static void main(String[] args) {
        // 1. 최상위 복합체 생성
        Composite composite1 = new Composite();

        // 2. 최상위 복합체에 저장할 Leaf와 또다른 서브 복합체 생성
        Leaf leaf1 = new Leaf();
        Composite composite2 = new Composite();

        // 3. 최상위 복합체에 개체들을 등록
        composite1.add(leaf1);
        composite1.add(composite2);

        // 4. 서브 복합체에 저장할 Leaf 생성
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Leaf leaf4 = new Leaf();

        // 5. 서브 복합체에 개체들을 등록
        composite2.add(leaf2);
        composite2.add(leaf3);
        composite2.add(leaf4);

        // 6. 최상위 복합체의 모든 자식 노드들을 출력
        composite1.operation();
    }
}