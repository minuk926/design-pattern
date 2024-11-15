package com.study.template.use;

import java.io.*;

abstract class AbstractFileProcessor {
    private String path; // 생성자로 부터 파일경로를 받아와 저장

    public AbstractFileProcessor(String path) {
        this.path = path;
    }

    // 템플릿 메소드 (오버라이딩 못하게 final 처리)
    public final int process() {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            int result = getResult();
            
            String line;
            while ((line = reader.readLine()) != null) {
                result = caculate(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException | NullPointerException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    protected abstract int caculate(int result, int number);
    protected abstract int getResult();
}