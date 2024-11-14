package com.study.proxy.dynamic;

import java.lang.reflect.*;

/**
 * <pre>
 * 자바 JDK에서는 별도로 프록시 객체 구현 기능을 지원한다. 이를 동적 프록시(Dynamic Proxy) 기법
 * 별도의 프록시 클래스 정의없이 런타임으로 프록시 객체를 동적으로 생성해 이용
 * </pre>
 */
public class Client {
    public static void main(String[] arguments) {
		
        // newProxyInstance() 메서드로 동적으로 프록시 객체를 생성할 수 있다.
        // 프록시 핸들러
        IAnimal tigerProxy = (IAnimal) Proxy.newProxyInstance(
                IAnimal.class.getClassLoader(), // 대상 객체의 인터페이스의 클래스로더
                new Class[]{IAnimal.class}, // 대상 객체의 인터페이스
                new InvocationHandler() { // 프록시 핸들러
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object target = new Tiger();
    
                        System.out.println("----eat 메서드 호출 전----");
    
                        Object result = method.invoke(target, args); // 타겟 메서드 호출
    
                        System.out.println("----eat 메서드 호출 후----");
    
                        return result;
                    }
                }
        );
        tigerProxy.eat();
    }
}