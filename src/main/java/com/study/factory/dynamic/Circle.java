package com.study.factory.dynamic;

import java.awt.*;

class Circle implements IShape {

    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("circle draw with " + color);
    }

}