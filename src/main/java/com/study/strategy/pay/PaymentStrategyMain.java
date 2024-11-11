package com.study.strategy.pay;

/**
 * <pre>
 * Strategy Pattern은 State Pattern 과 매우 유사 
 * - 차이점 중 하나는 Context가 인스턴스 변수로 상태를 포함하고 상태에 따라 구현이 달라질 수 있는 여러 작업이 있을 수 있는
 *   반면 Strategy Pattern에서는 Strategy가 메서드에 인수로 전달되고 Context 객체에는 저장할 변수가 없다는 것
 * - 전략 패턴은 특정 작업에 대한 여러 알고리즘이 있고, 특정 작업에 대해 런타임에 알고리즘을 선택할 수 있도록 애플리케이션이 유연해야 할 때 유용  
 * description : 
 * packageName : com.study.strategy
 * fileName    : PaymentStrategyMain
 * author      : limju
 * date        : 2024 11월 07
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 07   limju       최초 생성
 *
 * </pre>
 */
public class PaymentStrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaymentPapalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new PaymentCreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
