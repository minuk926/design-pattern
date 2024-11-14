package com.study.decorator.nonuse;

public class Client {
    public static void main(String[] args) {
        SynchronizedData data = new SynchronizedData();
        data.setData(1);
        System.out.println(data.getData());
    }
}