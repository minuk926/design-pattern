package com.study.template.use;

// 더하기 연산 수행
class PlusFileProcessor extends AbstractFileProcessor {

    public PlusFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int caculate(int result, int number) {
        return result += number;
    }
    
    @Override
    protected int getResult() {
        return 0;
    }
}

// 곱셈 연산 수행
class MultiplyFileProcessor extends AbstractFileProcessor {

    public MultiplyFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int caculate(int result, int number) {
        return result *= number;
    }
    
    @Override
    protected int getResult() {
        return 1; // 곱셈은 초깃값이 0이면 X
    }
}