package com.study.factory.member;

/**
 * <pre>
 * description : 
 * packageName : com.study.factory.member
 * fileName    : NaverMember
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class NaverMember implements IMember{
    @Override
    public void signup() {
        System.out.println("Naver Member Signup");
    }
}
