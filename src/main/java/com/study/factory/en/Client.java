package com.study.factory.en;

import java.awt.*;

class Client {
    public static void main(String[] args) {
        IShape rectangle = EnumShapeFactory.RECTANGLE.create("red");
        rectangle.draw();

        IShape circle = EnumShapeFactory.CIRCLE.create("yellow");
        circle.draw();
    }
}