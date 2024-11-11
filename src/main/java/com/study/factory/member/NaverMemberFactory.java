package com.study.factory.member;

/**
 * <pre>
 * description : 
 * packageName : com.study.factory.member
 * fileName    : NaverMemberFactory
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class NaverMemberFactory implements IMemberFactory{
    @Override
    public IMember createMember() {
        return new NaverMember();
    }
}
