package com.study.decorator.use;

// 장식될 원본 객체
class MyData implements IData{
    private int data;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}