package com.study.proxy.protection.proxy;

import java.util.*;

import com.study.proxy.protection.*;

class Client {
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

        // 기존에 등록된 리스트를 수정할 수 없으니, 동적으로 기존의 Employee 객체를 프록시 객체 ProtectedEmployee로 Wrap하는 작업을 실행한다.
        List<IEmployee> protectedEmployees = new ArrayList<>();
        for (Employee e : employees) {
            protectedEmployees.add(new ProtectionEmployeeProxy((IEmployee) e));
        }

        /*-----------------------------------------------------------------------------------------*/

        // 나 : 일개 사원 직책
        Employee me = new Employee("inpa", RESPONSIBILITY.STAFF);

        System.out.println("\n================================================================");
        System.out.println("시나리오1. 일개 사원인 내가 회사 인원 인사 정보 조회");
        System.out.println("================================================================");
        PrintEmployeeInfo view = new PrintEmployeeInfo(me); 
        view.printAllInfo(protectedEmployees); 

        System.out.println("\n================================================================");
        System.out.println("시나리오2. 과장이 회사 인원 인사 정보 조회");
        System.out.println("================================================================");
        PrintEmployeeInfo view2 = new PrintEmployeeInfo(devManager);
        view2.printAllInfo(protectedEmployees); 

        System.out.println("\n================================================================");
        System.out.println("시나리오3. 상무가 회사 인원 인사 정보 조회");
        System.out.println("================================================================");
        PrintEmployeeInfo view3 = new PrintEmployeeInfo(CTO);
        view3.printAllInfo(protectedEmployees);
    }
}