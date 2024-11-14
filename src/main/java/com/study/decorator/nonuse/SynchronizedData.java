package com.study.decorator.nonuse;

class SynchronizedData extends MyData {
	private int data;
    
    public void setData(int data) {
    	// synchronized (대상 객체) {} 블럭
        synchronized (this) {
            this.data = data;
        }
    }

    public int getData() {
        synchronized (this) {
            return data;
        }
    }
}