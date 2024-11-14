package com.study.proxy.dynamic;

class Tiger implements IAnimal{
    @Override
    public void eat() {
        System.out.println("호랑이가 음식을 먹습니다.");
    }
}