package com.study.proxy.protection;

import java.util.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.protection
 * fileName    : NonUseProxyClient
 * author      : limju
 * date        : 2024 11월 14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 14   limju       최초 생성
 *
 * </pre>
 */
public class NonUseProxyClient {
    public static void main(String[] args) {
        // 직원별 개인 객체 생성
        Employee CTO = new Employee("Dragon Jung", RESPONSIBILITY.DIRECTOR);
        Employee devManager = new Employee("Cats Chang", RESPONSIBILITY.MANAGER);
        Employee financeManager = new Employee("Dell Choi", RESPONSIBILITY.MANAGER);
        Employee devStaff = new Employee("Dark Kim", RESPONSIBILITY.STAFF);
        Employee financeStaff = new Employee("Pal Yoo", RESPONSIBILITY.STAFF);

        // 직원들을 리스트로 가공
        List<Employee> employees = Arrays.asList(CTO, devManager, financeManager, devStaff, financeStaff);

        /*-----------------------------------------------------------------------------------------*/

        // 나 : 일개 사원 직책
        Employee me = new Employee("inpa", RESPONSIBILITY.STAFF);

        System.out.println("\n================================================================");
        System.out.println("시나리오1. 일개 사원인 내가 회사 인원 인사 정보 조회");
        System.out.println("================================================================");
        PrintEmployeeInfo view = new PrintEmployeeInfo(me); // 모든 직원 정보를 출력하는 클래스
        view.printAllInfo(employees); // 일개 사원에 불구하고 모든 직원 조회
    }
}
