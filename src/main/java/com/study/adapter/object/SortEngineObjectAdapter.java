package com.study.adapter.object;

import com.study.adapter.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.object
 * fileName    : SortEngineAdapter
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class SortEngineObjectAdapter implements ISortEngine {
    SortEngineA sortEngineA;
    SortEngineB sortEngineB;
    
    public SortEngineObjectAdapter(SortEngineA sortEngineA, SortEngineB sortEngineB) {
        this.sortEngineA = sortEngineA;
        this.sortEngineB = sortEngineB;
    }
    
    @Override
    public void setList() {
        sortEngineB.setList();
    }

    /**
     * 메서드 시그니처가 달라 위임을 통해 호환 작업
     */
    @Override
    public void sort() {
        sortEngineB.sorting(false);
    }

    /**
     * 메서드 시그니처가 달라 위임을 통해 호환 작업
     */
    @Override
    public void reverseSort(){
        sortEngineB.sorting(true);
    }

    /**
     * B 엔진에 없는 기능을 A 엔진으로 실행
     */
    @Override
    public void printSortListPretty(){
        sortEngineA.printSortListPretty();
    }
}
