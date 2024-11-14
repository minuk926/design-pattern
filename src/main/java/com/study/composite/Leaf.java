package com.study.composite;

class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println(this + " 호출");
    }
}