package com.study.responsibility.valid;

import com.study.responsibility.invalid.*;

// ConcreteHandler 역할
class LimitLoginAttemptMiddleware extends Middleware {
    private int limit = 3; // 로그인 시도 최대 횟수 3회
    private int count = 0;

    @Override
    public short check(String email, String password) {
        short flag = 1;

        if (count > limit) {
            System.out.println("로그인 요청 횟수 제한 !!");
            flag = -2; // Exception 플래그
        } else {
            flag = super.check(email, password);
        }

        count++;

        return flag;
    }
}

class AuthorizeMiddleware extends Middleware {
    private Server server;

    public AuthorizeMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public short check(String email, String password) {
        short flag = 1;

        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            flag = 0; // continue 플래그
        } else if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            flag = 0; // continue 플래그
        } else {
            flag = super.check(email, password);
        }

        return flag;
    }
}

class AuthenticationMiddleware extends Middleware {
    @Override
    public short check(String email, String password) {
        short flag = 1;

        if (email.equals("inpa@tistory.com")) {
            System.out.println("Hello, admin!");
            flag = -1; // break 플래그
        } else {
            System.out.println("Hello, user!");
            flag = super.check(email, password);
        }

        return flag;
    }
}

class LoggingMiddleware extends Middleware {
    @Override
    public short check(String email, String password) {
        System.out.println("요청을 로깅합니다.");
        return -1; // break 플래그
    }
}