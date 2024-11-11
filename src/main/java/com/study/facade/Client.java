package com.study.facade;

class Client {
    public static void main(String[] args) {
        // 1. 퍼사드 객체 생성
        Facade facade = new Facade();

        // 2. db 값 insert
        facade.insert();

        // 3. 퍼사드로 데이터베이스 & 캐싱 & 메세징 로직을 한번에 조회
        String name = "홍길동";
        facade.run(name);


        // // 1. 데이터베이스 생성 & 등록
        // DBMS dbms = new DBMS();
        // dbms.put("홍길동", new Row("홍길동", "1890-02-14", "honggildong@naver.com"));
        // dbms.put("임꺽정", new Row("임꺽정", "1820-11-02", "imgguckjong@naver.com"));
        // dbms.put("주몽", new Row("주몽", "710-08-27", "jumong@naver.com"));
        //
        // // 2. 캐시 생성
        // Cache cache = new Cache();
        //
        // // 3. 트랜잭션에 앞서 먼저 캐시에 데이터가 있는지 조회
        // Row row = cache.get(name);
        //
        // // 4. 만약 캐시에 없다면
        // if (row == null){
        //     row = dbms.query(name); // DB에 해당 데이터를 조회해서 row에 저장하고
        //     if(row != null) {
        //         cache.put(row); // 캐시에 저장
        //     }
        // }
        //
        // // 5. dbms.query(name)에서 조회된 값이 있으면
        // if(row != null) {
        //     Message message = new Message(row);
        //
        //     System.out.println(message.makeName());
        //     System.out.println(message.makeBirthday());
        //     System.out.println(message.makeEmail());
        // }
        // // 6. 조회된 값이 없으면
        // else {
        //     System.out.println(name + " 가 데이터베이스에 존재하지 않습니다.");
        // }
    }
}