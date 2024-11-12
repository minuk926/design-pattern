package com.study.responsibility;

/**
 * 사용자로부터 url 문자열을 입력받으면, 각 url의 프로토콜, 도메인, 포트를 파싱해서 정보를 출력해주는 프로그램
 */
class UrlParser {
    public static void run(String url) {
        // protocol 파싱
        int index = url.indexOf("://");
        if (index != -1) {
            System.out.println("PROTOCOL : " + url.substring(0, index));
        } else {
            System.out.println("NO PROTOCOL");
        }

        // domain 파싱
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

        // port 파싱
        int index2 = url.lastIndexOf(":");
        if (index2 != -1) {
            String strPort = url.substring(index2 + 1);
            try {
                int port = Integer.parseInt((strPort));
                System.out.println("PORT : " + port);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        String url1 = "http://www.youtube.com:80";
        System.out.println("INPUT: " + url1);
        UrlParser.run(url1);

        String url2 = "https://www.inpa.tistory.com:443";
        System.out.println("INPUT: " + url2);
        UrlParser.run(url2);

        String url3 = "http://localhost:8080";
        System.out.println("INPUT: " + url3);
        UrlParser.run(url3);
    }
}