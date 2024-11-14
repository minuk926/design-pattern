package com.study.decorator.use;

class TimerMeasureDecorator extends MyDataDecorator {

    TimerMeasureDecorator(IData mydataObj) {
        super(mydataObj);
    }

    public void setData(int data) {
        long startTime = System.nanoTime(); // 코드 시작 시간
        super.setData(data);
        long endTime = System.nanoTime(); // 코드 끝난 시간
        long durationTimeSec = endTime - startTime;
        System.out.println(durationTimeSec + "n/s"); // 나노세컨드 출력
    }

    public int getData() {
        long startTime = System.nanoTime(); // 코드 시작 시간
        int result = super.getData();
        long endTime = System.nanoTime(); // 코드 끝난 시간
        long durationTimeSec = endTime - startTime;
        System.out.println(durationTimeSec + "n/s"); // 나노세컨드 출력
        return result;
    }
}