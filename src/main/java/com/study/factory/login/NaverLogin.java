package com.study.factory.login;

/**
 * <pre>
 * description : 
 * packageName : com.study.factory.login
 * fileName    : NaverLogin
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class NaverLogin implements ILogin{

    @Override
    public void execute(String id, String password){
        System.out.println( "Naver Login: " + id + " " + password);
    }

    @Override
    public LoginType getType(){ 
        return LoginType.NAVER;
    }

}
