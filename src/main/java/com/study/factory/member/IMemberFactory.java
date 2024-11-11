package com.study.factory.member;

/**
 * <pre>
 * description : 
 * packageName : com.study.factory.member
 * fileName    : IMemberFactory
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
 * Interface 구현 방식
 */
public interface IMemberFactory {
    default IMember newMember(){
        IMember member = createMember();
        member.signup();
        return member;
    }
    
    // interface는 접근자로 public 
    IMember createMember();
}
