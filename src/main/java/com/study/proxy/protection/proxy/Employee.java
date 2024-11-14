package com.study.proxy.protection.proxy;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.protection.proxy
 * fileName    : Employee
 * author      : limju
 * date        : 2024 11월 14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 14   limju       최초 생성
 *
 * </pre>
 */

import com.study.proxy.protection.*;

/**
 * 구성원 클래스
 */
class Employee implements IEmployee{
    private String name; // 이름
    private RESPONSIBILITY position; // 직위

    public Employee(String name, RESPONSIBILITY position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public RESPONSIBILITY getGrade() {
        return position;
    }

    @Override
    public String getInfo(IEmployee viewer) {
        return "Display " + getGrade().name() + " '" + getName() + "' personnel information.";
    }
}
