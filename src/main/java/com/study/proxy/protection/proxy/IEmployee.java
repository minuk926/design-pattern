package com.study.proxy.protection.proxy;

import com.study.proxy.protection.*;

/**
 * 구성원 인터 페이스 선언 추가
 */
interface IEmployee {
    String getName(); // 구성원의 이름
    RESPONSIBILITY getGrade(); // 구성원의 직책
    String getInfo(IEmployee viewer); // 구성원의 인사정보
}