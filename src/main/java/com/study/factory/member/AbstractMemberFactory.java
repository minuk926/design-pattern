package com.study.factory.member;

/**
 * <pre>
 * description : 
 * packageName : com.study.factory.member
 * fileName    : MemberFactory
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */

/**
 * abstract method 구현 방식
 */
public abstract class AbstractMemberFactory {
    
    public IMember newMember() {
        IMember member = createMember();
        member.signup();
        return member;
    }
    protected abstract IMember createMember();
}
