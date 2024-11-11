package com.study.factory.en;

import java.awt.*;

/**
 * <pre>
 * Factory Method 패턴의 가장 큰 단점은 제품 객체의 갯수마다 공장 서브 클래스를 모두 구현해야 된다는 점
 * 기본적으로 팩토리 클래스는 한번 인스턴스화 하고 제품 객체를 생성하는 역할만 하면 되지 
 * 여러개 생성될수 있는 낭비적인 가능성이 있기 때문에 싱글톤을 일일히 적용하여야 하며 
 * 이로인해 코드가 복잡해진 다는 문제점도 있었다.
 * 이러한 문제점을 Enum 으로 팩토리 메서드 패턴을 구성해 준다면, 일일히 서브 공장 클래스 구현 없이 하나의 enum Factory에서
 * SOLID 원칙위반 없이 팩토리 클래스를 구성해 줄 수 있다.
 * 
 * 단점은 클래스 상속이 필요할때, enum 외의 클래스 상속은 불가능하기 때문에 다시 일반 클래스로 재구성 해야된다는 한계점이 존재
 * </pre>
 */
enum EnumShapeFactory {
    RECTANGLE {
        public IShape createShape() {
            return new Rectangle();
        }
    },
    CIRCLE {
        public IShape createShape() {
            return new Circle();
        }
    };

    public IShape create(String color) {
        IShape shape = createShape();
        shape.setColor(color);
        return shape;
    }

    // 팩토리 메서드
    abstract protected IShape createShape();
}