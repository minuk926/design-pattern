package com.study.facade;

/**
 * 퍼사드는 하위 시스템 클래스들을 캡슐화 하는 것이 아니다. 
 * 그냥 서브 시스템들을 사용할 간단한 인터페이스를 제공할 뿐 이다. 
 * 사용자가 서브 시스템 내부의 클래스를 직접 사용하는 것을 제한할 수는 없다. 
 * 그래서 오히려 추상화에 가깝다
 * 대부분의 경우 퍼사드 객체는 하나만 있어도 충분하므로, 퍼사드 클래스를 싱글톤으로 구성해주면 좋다.
 */
class Facade {
    private DBMS dbms = new DBMS();
    private Cache cache = new Cache();

    public void insert() {
        dbms.put("홍길동", new Row("홍길동", "1890-02-14", "honggildong@naver.com"));
        dbms.put("임꺽정", new Row("임꺽정", "1820-11-02", "imgguckjong@naver.com"));
        dbms.put("주몽", new Row("주몽", "710-08-27", "jumong@naver.com"));
    }

    public void run(String name) {
        Row row = cache.get(name);

        // 1. 만약 캐시에 없다면
        if (row == null){
            row = dbms.query(name); // DB에 해당 데이터를 조회해서 row에 저장하고
            if(row != null) {
                cache.put(row); // 캐시에 저장
            }
        }

        // 2. dbms.query(name)에서 조회된 값이 있으면
        if(row != null) {
            Message message = new Message(row);

            System.out.println(message.makeName());
            System.out.println(message.makeBirthday());
            System.out.println(message.makeEmail());
        }
        // 3. 조회된 값이 없으면
        else {
            System.out.println(name + " 가 데이터베이스에 존재하지 않습니다.");
        }
    }
}