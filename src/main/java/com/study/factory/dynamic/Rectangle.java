package com.study.factory.dynamic;

class Rectangle implements IShape {

    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("rectangle draw with " + color);
    }

}