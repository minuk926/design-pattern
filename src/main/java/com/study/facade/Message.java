package com.study.facade;

/**
 * Row 클래스를 보기좋게 출력하는 클래스
 */
class Message {
    private Row row;

    public Message(Row row) {
        this.row = row;
    }

    public String makeName() {
        return "Name : \"" + row.getName() + "\"";
    }

    public String makeBirthday() {
        return "Birthday : " + row.getBirthday();
    }

    public String makeEmail() {
        return "Email : " + row.getEmail();
    }
}