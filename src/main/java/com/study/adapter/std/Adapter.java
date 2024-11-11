package com.study.adapter.std;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.std
 * fileName    : Adapter
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class Adapter implements ITarget {
    private final Adaptee adaptee;
    
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public void doSomething() {
        adaptee.perform();
    }
}
