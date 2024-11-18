package com.study.proxy.ex;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.ex
 * fileName    : Logging
 * author      : limju
 * date        : 2024 11월 18
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 18   limju       최초 생성
 *
 * </pre>
 */
public class Logging implements IPrinter{
    @Override
    public String print(String message) {
        System.out.println(System.currentTimeMillis() + " : " + message);
        return message;
    }
}
