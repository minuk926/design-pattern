package com.study.adapter.std;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.std
 * fileName    : AdapterMain
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class AdapterMain {
    public static void main(String[] args) {
        ITarget target = new Adapter(new Adaptee());
        target.doSomething();
    }
}
