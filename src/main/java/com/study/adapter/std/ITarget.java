package com.study.adapter.std;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.std
 * fileName    : ITarget
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */

/**
 * target interface
 */
public interface ITarget {
    default void doSomething() {
        System.out.println("기존 interface And 구현 클래스 존재");
    }
}
