package com.study.proxy.ex;

import java.util.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.ex
 * fileName    : PrinterProxy
 * author      : limju
 * date        : 2024 11월 18
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 18   limju       최초 생성
 *
 * </pre>
 */
public class PrinterProxy implements IPrinter{
    private final String model;
    private final List<IAspect> aspect;

    public PrinterProxy(String model, IAspect ...aspect) {
        this.model = model;
        this.aspect = List.of(aspect);
    }
    
    // public String print(String message) {
    //     IPrinter printer = new Printer(this.model);
    //     System.out.println("프린트 시작 :: "+System.nanoTime());
    //     String rslt = printer.print(message);
    //     System.out.println("프린트 종료 :: "+System.nanoTime());
    //     return rslt;
    // }

    public String print(String message) {
        IPrinter printer = new Printer(this.model);
        aspect.forEach(a->a.before());
        String rslt = printer.print(message);
        aspect.forEach(a->a.after());
        return rslt;
    }
}
