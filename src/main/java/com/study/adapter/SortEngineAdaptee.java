package com.study.adapter;

/**
 * <pre>
 * description : 
 * packageName : com.study.adapter
 * fileName    : SortEngineA
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class SortEngineAdaptee implements ISortEngine {
    public void setList() {
        System.out.println("Sort List A");
    }
    public void sort() {
        System.out.println("Sort A");
    }
    public void reverseSort() {
        System.out.println("Reverse Sort A");
    }
    public void printSortListPretty() {
        System.out.println("Sort List Pretty A");
    }
}
