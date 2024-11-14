package com.study.decorator.use;

public class Client2 {
    public static void main(String[] args) {
    
    	// 동시성이 필요없을 때
        IData data = new MyData(); 
        data.setData(1);
        System.out.println( data.getData());
        
    	// 동시성이 필요할 때
        IData dataSync = new SynchronizedDecorator(data);
        dataSync.setData(1);
        System.out.println(dataSync.getData()); // 1
    }
}