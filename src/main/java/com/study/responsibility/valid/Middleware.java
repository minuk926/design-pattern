package com.study.responsibility.valid;

// Handler 역할
abstract class Middleware {
    // 다음 체인으로 연결될 핸들러
    protected Middleware nextMiddleware = null;

    // setter 메서드를 통해 연결시킬 핸들러를 등록
    public Middleware setNext(Middleware middleware) {
        this.nextMiddleware = middleware;
        return middleware; // 메서드 체이닝 구성을 위해 인자를 그대로 반환함
    }

    // 핸들러가 요청에 대해 처리하는 메서드
    public short check(String email, String password) {
        /*
          flag는 클라이언트 실행부에서 while문을 빠져나가기 위한 조건값으로 사용된다
          -2 : Exception 일으킴
          -1 : break 동작 (루프문 종료)
          0 : continue 동작 (처음부터 콘솔 입력 받기)
          1 : 그대로 처리를 진행함
         */
        short flag = 1;

        // 만일 핸들러가 연결된게 있다면 다음 핸들러로 책임을 떠넘긴다
        if (nextMiddleware != null) {
            flag = nextMiddleware.check(email, password);
        }

        return flag;
    }
}