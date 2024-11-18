package com.study.proxy.ex;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.ex
 * fileName    : LogAspect
 * author      : limju
 * date        : 2024 11월 18
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 18   limju       최초 생성
 *
 * </pre>
 */
public class LogAspect implements IAspect {
    @Override
    public void before() {
        System.out.println("logging before :: " + System.currentTimeMillis());
    }
    @Override
    public void after() {
        System.out.println("logging after :: " + System.currentTimeMillis());
    }
}
