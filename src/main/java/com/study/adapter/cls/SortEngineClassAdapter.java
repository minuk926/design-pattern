package com.study.adapter.cls;

import com.study.adapter.*;
import com.study.adapter.object.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.cls
 * fileName    : SortEngineClassAdapter
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class SortEngineClassAdapter extends SortEngineB implements ISortEngine {
    @Override
    public void setList() {
        super.setList();
    }

    @Override
    public void sort() {
        sorting(false);
    }

    @Override
    public void reverseSort() {
        sorting(true);
    }

    @Override
    public void printSortListPretty() {
        // A_SortEngine 클래스의 원본 printSortListPretty 메서드의 알고리즘 로직을 그대로 복붙 및 구현
    }
}
