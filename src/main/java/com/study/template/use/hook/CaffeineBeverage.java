package com.study.template.use.hook;

abstract class CaffeineBeverage {

    // 템플릿 메서드
    final void prepareRecipe() {
        boilWater(); // "물 끓이기"
        brew();
        pourInCup(); // "컵에 따르는 중"
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    // hook 메서드
    boolean customerWantsCondiments() {
        return false;
    }

    public void boilWater() {
        System.out.println("물 끓이기");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}