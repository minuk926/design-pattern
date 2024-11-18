package com.study.proxy.ex;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy
 * fileName    : Printer
 * author      : limju
 * date        : 2024 11월 18
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 18   limju       최초 생성
 *
 * </pre>
 */

public class Printer implements IPrinter {
    private final String model;

    public Printer(String model) {
        this.model = model;
    }
    
    @Override
    public String print(String message) {
        return String.format("<%s>%s</%s>", this.model, message, this.model);
    }
}
