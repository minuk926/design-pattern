package com.study.proxy.protection.proxy;

import java.util.*;

/**
 * 전 구성원을 모두 출력
 */
class PrintEmployeeInfo {
    IEmployee viewer; // 조회하려는 자
    
    PrintEmployeeInfo(IEmployee viewer) {
        this.viewer = viewer;
    }
	
    // Employee 객체 리스트를 받아 직원들의 정보를 순회하여 조회
    void printAllInfo(List<IEmployee> employees) {
        employees.stream()
                .map(employee -> employee.getInfo(viewer))
                .forEach(System.out::println);
    }
}