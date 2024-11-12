package com.study.responsibility.valid;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException {
        // 1. 서버 생성 및 등록
        Server server = new Server();
        server.register("john@naver.com", "123123");
        server.register("kail@google.com", "456456");
        server.register("inpa@tistory.com", "789789");

        // 2. 인증 로직을 처리하는 핸들러 생성
        LimitLoginAttemptMiddleware middleware1 = new LimitLoginAttemptMiddleware();
        AuthorizeMiddleware middleware2 = new AuthorizeMiddleware(server);
        AuthenticationMiddleware middleware3 = new AuthenticationMiddleware();
        LoggingMiddleware middleware4 = new LoggingMiddleware();

        // 3. 핸들러 체인
        middleware1
                .setNext(middleware2)
                .setNext(middleware3)
                .setNext(middleware4);

        // 4. 클라이언트로부터 로그인 시도
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nEmail: ");
            String email = reader.readLine();
            System.out.print("Password: ");
            String password = reader.readLine();

            // 핸들러부터 정수 flag를 받아, 정수값에 따라 루프문 다음 동작을 처리
            short result = middleware1.check(email, password);

            if (result == -2) {
                throw new RuntimeException("로그인 시도 횟수 초과로 프로그램을 종료합니다");
            } else if (result == -1) {
                break;
            } else if (result == 0) {
                continue;
            }

        } while (true);
    }
}