package com.study.responsibility;

/**

 /**
 * <pre>
 * 책임 연쇄 패턴(Chain Of Responsibility Pattern, COR)
 * 구체적인 핸들러를 묶는 인터페이스 (추상 클래스)
 *
 * 특정 요청을 2개 이상의 여러 객체에서 판별하고 처리해야 할때
 * 특정 순서로 여러 핸들러를 실행해야 하는 경우
 * 프로그램이 다양한 방식과 종류의 요청을 처리할 것으로 예상되지만 정확한 요청 유형과 순서를 미리 알 수 없는 경우
 * 요청을 처리할 수 있는 객체 집합이 동적으로 정의되어야 할 때 (체인 연결을 런타임에서 동적으로 설정)
 *
 * 클라이언트는 처리 객체의 체인 집합 내부의 구조를 알 필요가 없다.
 * 각각의 체인은 자신이 해야하는 일만 하기 때문에 새로운 요청에 대한 처리객체 생성이 편리해진다.
 * 클라이언트 코드를 변경하지 않고 핸들러를 체인에 동적으로 추가하거나 처리 순서를 변경하거나 삭제할 수 있어 유연해진다
 * 요청의 호출자(invoker)와 수신자(receiver) 분리시킬 수 있다
 *
 * 요청을 하는 쪽과 요청을 처리하는 쪽을 디커플링 시켜 결합도를 낮춘다
 * 요청을 처리하는 방법이 바뀌더라도 호출자 코드는 변경되지 않는다.
 * </pre>
 */
class ProtocolHandler extends Handler {
    @Override
    protected void process(String url) {
        int index = url.indexOf("://");
        if (index != -1) {
            System.out.println("PROTOCOL : " + url.substring(0, index));
        } else {
            System.out.println("NO PROTOCOL");
        }
    }
}

class DomianHandler extends Handler {
    @Override
    protected void process(String url) {
        int startIndex = url.indexOf("://");
        int lastIndex = url.lastIndexOf(":");

        System.out.print("DOMAIN : ");
        if (startIndex == -1) {
            if (lastIndex == -1) {
                System.out.println(url);
            } else {
                System.out.println(url.substring(0, lastIndex));
            }
        } else if (startIndex != lastIndex) {
            System.out.println(url.substring(startIndex + 3, lastIndex));
        } else {
            System.out.println(url.substring(startIndex + 3));
        }
    }
}

class PortHandler extends Handler {
    @Override
    protected void process(String url) {
        int index = url.lastIndexOf(":");
        if (index != -1) {
            String strPort = url.substring(index + 1);
            try {
                int port = Integer.parseInt((strPort));
                System.out.println("PORT : " + port);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}

class Client {
    public static void main(String[] args) {
        // 1. 핸들러 생성
        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new DomianHandler();
        Handler handler3 = new PortHandler();

        // 2. 핸들러 연결 설정 (handler1 → handler2 → handler3)
        handler1.setNext(handler2).setNext(handler3);

        // 3. 요청에 대한 처리 연쇄 실행
        String url1 = "http://www.youtube.com:80";
        System.out.println("INPUT: " + url1);
        handler1.run(url1);

        System.out.println();

        String url2 = "https://www.inpa.tistory.com:443";
        System.out.println("INPUT: " + url2);
        handler1.run(url2);

        System.out.println();

        String url3 = "http://localhost:8080";
        System.out.println("INPUT: " + url3);
        handler1.run(url3);
    }
}