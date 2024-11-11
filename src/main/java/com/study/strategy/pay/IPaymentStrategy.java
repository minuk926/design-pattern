package com.study.strategy.pay;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : IPaymentStrategy
 * author      : limju
 * date        : 2024 11월 07
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 07   limju       최초 생성
 *
 * </pre>
 */
public interface IPaymentStrategy {
    public void pay(int amount);
}
