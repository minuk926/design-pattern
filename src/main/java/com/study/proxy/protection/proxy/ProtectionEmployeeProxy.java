package com.study.proxy.protection.proxy;

import com.study.proxy.protection.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.protection.proxy
 * fileName    : ProtectionEmployeeProxy
 * author      : limju
 * date        : 2024 11월 14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 14   limju       최초 생성
 *
 * </pre>
 */
public class ProtectionEmployeeProxy implements IEmployee{
    private IEmployee employee;
    
    public ProtectionEmployeeProxy(IEmployee employee) {
        this.employee = employee;
    }
    
    @Override
    public String getInfo(IEmployee viewer){
        RESPONSIBILITY position = this.employee.getGrade();

        // 매개변수로 받은 조회자의 직책에 따라 출력을 제어
        switch (viewer.getGrade()) {
            case DIRECTOR:
                // 부사장은 과장, 사원들을 볼 수 있다.
                return this.employee.getInfo(viewer);
            case MANAGER:
                // 과장은 같은 직무와 그 아래 사원들을 볼 수 있다. 사장 정보는 볼 수 없다.
                if (position != RESPONSIBILITY.DIRECTOR) {
                    return this.employee.getInfo(viewer);
                }
            case STAFF:
                // 사원은 같은 직무인 사람들만 볼 수 있다. 과장, 사장 정보는 볼 수 없다.
                if (position != RESPONSIBILITY.DIRECTOR && position != RESPONSIBILITY.MANAGER) {
                    return this.employee.getInfo(viewer);
                }
            default: return "다른 사람의 인사정보를 조회 할수 없습니다";
        }
    }
    
    @Override
    public String getName() {
        return this.employee.getName();
    }
    
    @Override
    public RESPONSIBILITY getGrade() {
        return this.employee.getGrade();
    }
    
}
