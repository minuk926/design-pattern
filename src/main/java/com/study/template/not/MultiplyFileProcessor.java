package com.study.template.not;

import java.io.*;

class MultiplyFileProcessor {
    private String path;

    public MultiplyFileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;

            // 파일에 있는 각 라인에 있는 숫자값들을 모두 곱셈
            while ((line = reader.readLine()) != null) {
                result *= Integer.parseInt(line); // 이 부분만 곱셈으로 바꿔준다.
            }
            return result;
            
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}