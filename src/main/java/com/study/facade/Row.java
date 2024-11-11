package com.study.facade;

/**
 * DBMS에 저장된 데이터를 나타내는 클래스
 */
class Row  {
    private String name;
    private String birthday;
    private String email;

    public Row(String name, String birthday, String email) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }
}