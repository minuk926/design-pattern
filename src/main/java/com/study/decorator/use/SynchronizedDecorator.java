package com.study.decorator.use;

/**
 * <pre>
 * description : 
 * packageName : com.study.decorator.use
 * fileName    : SynchronizedDecorator
 * author      : limju
 * date        : 2024 11월 14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 14   limju       최초 생성
 *
 * </pre>
 */
public class SynchronizedDecorator extends MyDataDecorator{
    
    public SynchronizedDecorator(IData data) {
        super(data);
    }
    
    @Override
    public void setData(int data) {
        synchronized (this) {
            System.out.println("동기화된 set data 처리 시작");
            super.setData(data);
            System.out.println("동기화된 set data 처리 완료");
        }
    }
    
    public int getData() {
        synchronized (this) {
            System.out.println("동기화된 get data 처리 시작");
            int rslt = super.getData();
            System.out.println("동기화된 get data 처리 완료");
            return rslt;
        }
    }
}
