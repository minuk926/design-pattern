package com.study.proxy;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.normal
 * fileName    : ISubject
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
 * <pre>
 * Proxy와 RealSubject를 하나로 묶는 인터페이스 (다형성)
 *
 * 대상 객체와 프록시 역할을 동일하게 하는 추상 메소드 action() 정의
 * 인터페이스가 있기 때문에 클라이언트는 Proxy 역할과 RealSubject 역할의 차이를 의식할 필요가 없다.
 * <pre>
 */
public interface ISubject {
    void action();
}
