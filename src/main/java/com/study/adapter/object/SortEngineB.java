package com.study.adapter.object;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter.object
 * fileName    : SortEngineB
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class SortEngineB {
    public void setList() {
        System.out.println("SortEngineB.setList()");
    } // 정렬할 리스트
    
    public void sorting(boolean isReverse) {
        System.out.println("SortEngineB.sorting()");
    } // 정렬 / 역순 정렬 알고리즘 (파라미터로 순서 결정)
}
