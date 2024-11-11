package com.study.factory.login;

import java.util.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.factory.login
 * fileName    : LoginMain
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class LoginMain {
    public static void main(String[] args) {
        List<ILogin> logins = new ArrayList<>();
        ILogin kakaoLogin = new KakaoLogin();
        logins.add(kakaoLogin);
        
        LoginFactory factory = new LoginFactory(logins);
        ILogin login = factory.getLogin(LoginType.KAKAO);
        login.execute("id", "password");
    }
}
