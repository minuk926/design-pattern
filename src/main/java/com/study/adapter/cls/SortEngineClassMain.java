package com.study.adapter.cls;

import com.study.adapter.*;
import com.study.adapter.object.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.cls
 * fileName    : SortEngineClassMain
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class SortEngineClassMain {
    public static void main(String[] args) {
        // 클라이언트의 머신에 원본 엔진 대신 어댑터를 할당한다.
        ISortEngine adaptor = new SortEngineClassAdapter();
        ClassEngineMachine machine = new ClassEngineMachine();
        machine.setEngine(adaptor);

        machine.sortingRun();

        ISortEngine adaptor2 = new SortEngineClassAdapter();

        adaptor2.setList();
        adaptor2.reverseSort();
        adaptor2.printSortListPretty();
    }
}
