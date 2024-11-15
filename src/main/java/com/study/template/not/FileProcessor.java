package com.study.template.not;

import java.io.*;

class FileProcessor {
    private String path; // 생성자로 부터 파일경로를 받아와 저장

    public FileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;

            // 파일에 있는 각 라인에 있는 숫자값들을 모두 덧셈
            while ((line = reader.readLine()) != null) {
                result += Integer.parseInt(line);
            }
            return result;

        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}

class Client {
    public static void main(String[] args) {
        // 파일경로 설정
        FileProcessor fileProcessor = new FileProcessor("number.txt");

        // 덧셈한 결과값 얻기
        int result = fileProcessor.process();
        System.out.println(result);
    }
}