package com.study.facade;

/**
 * <pre>
 * description : 
 * packageName : com.study.facade
 * fileName    : DBMS
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */

import java.util.*;

/**
 * 데이터베이스 역할을 하는 클래스
 */
public class DBMS {
    private HashMap<String, Row> db = new HashMap<>();

    public void put(String name, Row row) {
        db.put(name, row);
    }

    // 데이터베이스에 쿼리를 날려 결과를 받아오는 메소드
    public Row query(String name) {
        try {
            Thread.sleep(500); // DB 조회 시간을 비유하여 0.5초대기로 구현
        } catch(InterruptedException e) {}

        return db.get(name.toLowerCase());
    }
}
