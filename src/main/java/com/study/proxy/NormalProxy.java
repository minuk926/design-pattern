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
 * 대상 객체(RealSubject)를 중계할 대리자 역할
 * 
 * 프록시는 대상 객체를 합성(composition)
 * 프록시는 대상 객체와 같은 이름의 메서드를 호출하며, 별도의 로직을 수행 할수 있다 (인터페이스 구현 메소드)
 * 프록시는 흐름제어만 할 뿐 결과값을 조작하거나 변경시키면 안 된다.
 * <pre>
 */
public class NormalProxy implements ISubject {
    private ISubject subject; //대상 객체 composition
    
    public NormalProxy(ISubject subject) {
        this.subject = subject;
    }
    
    @Override
    public void action() {
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
        ISubject proxy = new NormalProxy(new Subject());
        proxy.action();
    }
}
