package com.study.decorator.use;

/**
 * <pre>
 * description : 
 * packageName : com.study.decorator.use
 * fileName    : MyDataDecorator
 * author      : limju
 * date        : 2024 11월 14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 14   limju       최초 생성
 *
 * </pre>
 */
abstract class MyDataDecorator implements IData{
    private IData data;
    
    MyDataDecorator(IData data) {
        this.data = data;
    }

    @Override
    public void setData(int data) {
        this.data.setData(data);
    }

    @Override
    public int getData() {
        return data.getData();
    }
}
