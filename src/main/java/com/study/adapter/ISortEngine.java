package com.study.adapter;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter
 * fileName    : ISortEngine
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public interface ISortEngine {
    void setList();         // 정렬할 리스트
    void sort();            // 정렬 알고리즘
    void reverseSort();     // 역순 정렬 알고리즘
    void printSortListPretty(); // 정렬된 리스트를 예쁘게 출력
}
