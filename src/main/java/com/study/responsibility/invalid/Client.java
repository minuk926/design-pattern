package com.study.responsibility.invalid;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException {
        // 1. 서버 생성 및 등록
        Server server = new Server();
        server.register("john@naver.com", "123123");
        server.register("kail@google.com", "456456");
        server.register("inpa@tistory.com", "789789");

        // 2. 인증 로직을 처리하는 미들웨어 생성
        Middleware middleware = new Middleware(server);

        // 3. 클라이언트로부터 로그인 시도
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nEmail: ");
            String email = reader.readLine();
            System.out.print("Password: ");
            String password = reader.readLine();

            // 만일 로그인 횟수가 남아있을 경우
            if (middleware.limitLoginAttempt()) {
                // 이메일 패스워드 인증
                if (middleware.authorize(email, password)) {
                    // 인증되었을 경우 일반 유저 계정인지 관리자 계정인지 검증
                    if (middleware.authentication(email)) {
                        // ...
                    } else {
                        // 관리자가 아닌 일반 유저 계정일 경우 로깅 처리
                        middleware.logging();
                    }
                    break;
                } else {
                    continue;
                }
            } else {
                throw new RuntimeException("로그인 시도 횟수 초과로 프로그램을 종료합니다");
            }
        } while (true);
    }
}