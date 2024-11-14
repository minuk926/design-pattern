package com.study.composite.ex2;

import java.util.*;

// Composite
class Folder implements Node {
    private String name; // 폴더 이름

    private ArrayList<Node> list;

    public Folder(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    // 리스트에 폴더, 파일 추가
    public void add(Node node) {
        list.add(node);
    }

    // 공백 indent 표현 처리를 위한 print 메서드 오버로딩
    public void print() {
        this.print("");
    }

    public void print(String str) {
        int size = getSize(); // 폴더가 담고 있는 모든 파일에 대한 용량 합산

        System.out.println(str + "\uD83D\uDCC2" + name + " (" + size + "kb)");

        for (Node node : list) {
            // Folder 일 경우 재귀 동작
            node.print(str + "    "); // 인자로 공백문자를 할당하여 indent 처리
        }
    }

    // 각 파일의 용량(kb) 구하기
    public int getSize() {
        int sum = 0;
        for (Node node : list) {
            sum += node.getSize(); // print 로직과 똑같이 재귀 동작
        }
        return sum;
    }
}