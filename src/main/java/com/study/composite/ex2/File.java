package com.study.composite.ex2;

// Leaf
class File implements Node {
    private String name; // 파일 이름
    private int size; // 파일 사이즈

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void print() {
        this.print("");
    }

    public void print(String str) {
        System.out.println(str + "\uD83D\uDCDC" + name + " (" + size + "kb)");
    }
    
    public int getSize() {
        return size;
    }
}