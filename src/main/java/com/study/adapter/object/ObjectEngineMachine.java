package com.study.adapter.object;

import com.study.adapter.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.object
 * fileName    : ObjectEngineMachine
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class ObjectEngineMachine {
    ISortEngine engine;

    void setEngine(ISortEngine engine) { 
        this.engine = engine; 
    }

    void sortingRun() {
        engine.setList();

        engine.sort();
        engine.printSortListPretty();

        engine.reverseSort();
        engine.printSortListPretty();
    }
}
