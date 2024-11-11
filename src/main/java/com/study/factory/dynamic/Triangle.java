package com.study.factory.dynamic;

class Triangle implements IShape {

    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("triangle draw with " + color);
    }

}