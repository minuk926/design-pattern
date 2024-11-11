package com.study.factory.login;

import java.util.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.factory.login
 * fileName    : LoginFactory
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class LoginFactory {
    private final Map<LoginType, ILogin> judgeMap;

    public LoginFactory(List<ILogin> logins) {

        HashMap<LoginType, ILogin> hashMap = new HashMap<>();

        for (ILogin login : logins ) {
            hashMap.put(login.getType(), login);
        }

        this.judgeMap = hashMap;
    }

    public ILogin getLogin(LoginType loginType) {
        return judgeMap.get(loginType);
    }
}
