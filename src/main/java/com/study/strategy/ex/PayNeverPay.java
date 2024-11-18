package com.study.strategy.ex;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy.ex
 * fileName    : PayNeverPay
 * author      : limju
 * date        : 2024 11월 18
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 18   limju       최초 생성
 *
 * </pre>
 */
public class PayNeverPay implements IPaymethod{
    @Override
    public String pay(int amount) {
        return "naver payed : " + amount;
    }
}
