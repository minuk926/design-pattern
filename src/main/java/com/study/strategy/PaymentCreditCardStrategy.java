package com.study.strategy;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : PaymentCreditCardStrategy
 * author      : limju
 * date        : 2024 11월 07
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 07   limju       최초 생성
 *
 * </pre>
 */
public class PaymentCreditCardStrategy implements IPaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public PaymentCreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }
}
