package com.study.strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.study.strategy.ex.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : StrategyTest
 * author      : limju
 * date        : 2024 11월 18
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 18   limju       최초 생성
 *
 * </pre>
 */
public class StrategyTest {
    
    @Test
    public void legacyPayTest() {
        PurchaseService service = new PurchaseService();
        String rslt = service.pay(new PayCreditCard(), 50);
        assertEquals("creditCard payed : 50", rslt); 
        
        PurchaseService service2 = new PurchaseService();
        String rslt2 = service2.pay(new PayNeverPay(), 50);
        assertEquals("naver payed : 50", rslt2); 
    }
}
