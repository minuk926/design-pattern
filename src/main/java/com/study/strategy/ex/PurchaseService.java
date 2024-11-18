package com.study.strategy.ex;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy.ex
 * fileName    : PurchaseService
 * author      : limju
 * date        : 2024 11월 18
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 18   limju       최초 생성
 *
 * </pre>
 */
public class PurchaseService {
    private IPaymethod paymethod;
    
    public PurchaseService(IPaymethod paymethod) {
        this.paymethod = paymethod;
    }

    public String pay(IPaymethod paymethod, int amount){
        return paymethod.pay(amount);
    }
}
