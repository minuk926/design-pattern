package com.study.strategy.pay;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : PaymentPapalStrategy
 * author      : limju
 * date        : 2024 11월 07
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 07   limju       최초 생성
 *
 * </pre>
 */
public class PaymentPapalStrategy implements IPaymentStrategy {
    private String emailId;
    private String password;

    public PaymentPapalStrategy(String email, String pwd){
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
    
}
