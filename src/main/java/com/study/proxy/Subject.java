package com.study.proxy;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.normal
 * fileName    : Subject
 * author      : limju
 * date        : 2024 11월 14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 14   limju       최초 생성
 *
 * </pre>
 */

/**
 * 원본 대상 객체
 */
public class Subject implements ISubject {
    @Override
    public void action() {
        System.out.println("원본 객체 action");
    }
}
