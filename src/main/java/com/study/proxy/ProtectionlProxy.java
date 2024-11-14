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
 * 프록시가 대상 객체에 대한 자원으로의 엑세스 제어(접근 권한)
 * 특정 클라이언트만 서비스 객체를 사용할 수 있도록 하는 경우
 * 프록시 객체를 통해 클라이언트의 자격 증명이 기준과 일치하는 경우에만 서비스 객체에 요청을 전달할 수 있게 한다.
 * <pre>
 */
public class ProtectionlProxy implements ISubject {
    boolean access;  // 접근 권한
    private ISubject subject;  // 대상 객체 composition
    
    public ProtectionlProxy(ISubject subject, boolean access) {
        this.subject = subject;
        this.access = access;
    }
    
    @Override
    public void action() {
        
        if(access) {
            // 위임
            subject.action();
            System.out.println("proxy action");
        }
    }

    /**
     * <pre>
     * Subject 인터페이스를 이용하여 프록시 객체를 생성해 이용.
     *
     * 클라이언트는 프록시를 중간에 두고 프록시를 통해서 RealSubject와 데이터를 주고 받는다.
     * <pre>
     */
    public static void main(String[] args) {
        ISubject proxy = new ProtectionlProxy(new Subject(), true);
        proxy.action();
    }
}
