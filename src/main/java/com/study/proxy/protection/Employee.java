package com.study.proxy.protection;

/**
 * 구성원 클래스
 */
class Employee {
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

    public String getInfo(Employee viewer) {
        return "Display " + getGrade().name() + " '" + getName() + "' personnel information.";
    }
}