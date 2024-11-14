package com.study.proxy;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy.normal
 * fileName    : SubjectProxy
 * author      : limju
 * date        : 2024 11월 14
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 14   limju       최초 생성
 *
 * </pre>
 */

/**
 * <pre>
 * 대상 객체에 대한 로깅을 추가하려는 경우
 * 프록시는 서비스 메서드를 실행하기 전달하기 전에 로깅을 하는 기능을 추가하여 재정의한다.
 * <pre>
 */
public class LoggingProxy implements ISubject {
    private ISubject subject;  // 대상 객체 composition
    
    public LoggingProxy(ISubject subject) {
        this.subject = subject;
    }
    
    @Override
    public void action() {
        System.out.println("로깅..................");         
        // 위임
        subject.action();
        System.out.println("proxy action");
    }

    /**
     * <pre>
     * Subject 인터페이스를 이용하여 프록시 객체를 생성해 이용.
     *
     * 클라이언트는 프록시를 중간에 두고 프록시를 통해서 RealSubject와 데이터를 주고 받는다.
     * <pre>
     */
    public static void main(String[] args) {
        ISubject proxy = new LoggingProxy(new Subject());
        proxy.action();
    }
}
