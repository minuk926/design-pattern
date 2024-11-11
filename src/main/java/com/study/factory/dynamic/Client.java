package com.study.factory.dynamic;

import java.awt.*;

class Client {
    public static void main(String[] args) {

        // 다이나믹 팩토리 클래스에 미리 등록된 제품 객체를 가져옴
        IShape rectangle = DynamicShapeFactory.create("Rectangle", "red");
        rectangle.draw();

        IShape circle = DynamicShapeFactory.create("Circle", "yellow");
        circle.draw();

        // 다이나믹 팩토리 클래스에 동적으로 제품 객체를 등록
        DynamicShapeFactory.registerType("Triangle", Triangle.class);
        IShape triangle = DynamicShapeFactory.create("Triangle", "green");
        triangle.draw();
    }
}