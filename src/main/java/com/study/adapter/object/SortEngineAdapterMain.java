package com.study.adapter.object;

import com.study.adapter.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.object
 * fileName    : SortEngineAdapterMain
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class SortEngineAdapterMain {
    public static void main(String[] args) {
        try {
            // 클라이언트의 머신에 원본 엔진 대신 어댑터를 할당한다.
            ISortEngine adaptor = new SortEngineObjectAdapter(new SortEngineA(), new SortEngineB());

            ObjectEngineMachine machine = new ObjectEngineMachine();
            machine.setEngine(adaptor);

            machine.sortingRun();

            ISortEngine adaptor2 = new SortEngineObjectAdapter(new SortEngineA(), new SortEngineB());

            adaptor2.setList();
            adaptor2.reverseSort();
            adaptor2.printSortListPretty();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
