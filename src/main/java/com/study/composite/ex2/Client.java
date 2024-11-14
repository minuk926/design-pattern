package com.study.composite.ex2;

class Client {
    public static void main(String[] args) {

        Folder root = new Folder("root");

        File file1 = new File("file1", 10);
        Folder sub1 = new Folder("sub1");
        Folder sub2 = new Folder("sub2");

        root.add(sub1);
        root.add(file1);
        root.add(sub2);

        File file11 = new File("file11", 10);
        File file12 = new File("file12", 10);

        sub1.add(file11);
        sub1.add(file12);

        File file21 = new File("file21", 10);

        sub2.add(file21);

        // 전체 dir 출력
        root.print();
    }
}