package com.study.factory.dynamic;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;

class DynamicShapeFactory {

    // Class 클래스 객체와 이를 구분하는 이니셜 문자열을 저장하는 HashMap 컬렉션
    private static final Map<String, Class<? extends IShape>> registeredTypes = new HashMap<>();

    // 팩토리 객체가 생성됨에 동시에 미리 등록
    static {
        registeredTypes.put("Rectangle", Rectangle.class);
        registeredTypes.put("Circle", Circle.class);
    }

    // 나중에 등록할때 사용하는 메서드
    public static void registerType(String type, Class<? extends IShape> cls) {
        registeredTypes.put(type, cls);
    }

    public static IShape create(String type, String color) {
        IShape shape = null;
        
        try {
            shape = getShape(type);
            shape.setColor(color);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return shape;
    }

    // 다이나믹 팩토리 메서드
    private static IShape getShape(String type) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // 1. 원하는 제품명의 Class 클래스 객체를 가져옴
        Class<?> cls = registeredTypes.get(type);

        // 2. 제품 객체의 생성자를 가져옴
        Constructor<?> shapeconstructor = cls.getDeclaredConstructor();

        // 3. Reflection API를 통해 인스턴스화를 하고 업캐스팅 하여 반환
        return (IShape) shapeconstructor.newInstance();
    }
}