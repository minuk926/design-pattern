package com.study.decorator.use;

// 원본 객체와 장식된 객체 모두를 묶는 인터페이스
interface IData{
    void setData(int data);
    int getData();
}