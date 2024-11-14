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
 * 지연 초기화 방식
 * 가끔 필요하지만 항상 메모리에 적재되어 있는 무거운 서비스 객체가 있는 경우
 * 이 구현은 실제 객체의 생성에 많은 자원이 소모 되지만 사용 빈도는 낮을 때 쓰는 방식이다.
 * 서비스가 시작될 때 객체를 생성하는 대신에 객체 초기화가 실제로 필요한 시점에 초기화될수 있도록 지연할 수 있다.
 * <pre>
 */
public class VirtualProxy implements ISubject {
    private ISubject subject; //대상 객체 composition
    
    public VirtualProxy() {
    }
    
    @Override
    public void action() {
        // 프록시 객체는 실제 요청(action(메소드 호출)이 들어 왔을 때 실제 객체를 생성한다.
        if(subject == null){
            subject = new Subject();
        }

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
        ISubject proxy = new VirtualProxy();
        proxy.action();
    }
}
