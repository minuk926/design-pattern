package com.study.adapter;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter
 * fileName    : SortEngineMain
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class SortEngineAdapter {
    ISortEngine engine;

    void setEngine(ISortEngine engine) { this.engine = engine; }

    void sortingRun() {
        engine.setList();

        engine.sort();
        engine.printSortListPretty();

        engine.reverseSort();
        engine.printSortListPretty();
    }

    public static void main(String[] args) {
        SortEngineAdapter machine = new SortEngineAdapter();
        machine.setEngine(new SortEngineAdaptee());
        machine.sortingRun();
    }
}
