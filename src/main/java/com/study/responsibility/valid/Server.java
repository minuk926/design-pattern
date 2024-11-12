package com.study.responsibility.valid;

import java.util.*;

class Server {
    private Map<String, String> users = new HashMap<>();

    // 서버에 유저 등록
    public void register(String email, String password) {
        users.put(email, password);
    }

    // 서버에 해당 이메일이 가입되어 있는지
    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }
    
    // 서버에 해당 계정의 비밀번호가 일치하는지
    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}