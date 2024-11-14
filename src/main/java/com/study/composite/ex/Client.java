package com.study.composite.ex;

class Client {
    public static void main(String[] args) {

        // 1. 메인 가방 인스턴스 생성
        Bag bag_main = new Bag("메인 가방");

        // 2. 아이템 인스턴스 생성
        Item armor = new Item("갑옷", 250);
        Item sword = new Item("장검", 500);

        // 3. 메인 가방에는 모험에 필요한 무구 아이템만을 추가
        bag_main.add(armor);
        bag_main.add(sword);

        // 4. 서브 가방 인스턴스 생성
        Bag bag_food = new Bag("음식 가방");

        // 5. 아이템 인스턴스 생성
        Item apple = new Item("사과", 400);
        Item banana = new Item("바나나", 130);

        // 6. 서브 가방에는 음식 아이템만을 추가
        bag_food.add(apple);
        bag_food.add(banana);

        // 7. 서브 가방을 메인 가방에 넣음
        bag_main.add(bag_food);

        // ----------------------------------------------------- //

        Client client = new Client();

        // 가방 안에 있는 모든 아이템의 총 값어치를 출력 (가방안에 아이템 뿐만 아니라 서브 가방도 들어있음)
        client.printPrice(bag_main);

        // 서브 가방 안에 있는 모든 아이템의 총 값어치를 출력
        client.printPrice(bag_food);
    }

    public void printPrice(ItemComponent bag) {
        int result = bag.getPrice();
        System.out.println(bag.getName() + "의 아이템 총합 : " + result + " 골드");
    }
}