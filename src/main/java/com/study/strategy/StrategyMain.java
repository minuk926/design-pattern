package com.study.strategy;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : StrategyMain
 * author      : limju
 * date        : 2024 11월 07
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 07   limju       최초 생성
 *
 * </pre>
 */
public class StrategyMain {
    public static void main(String[] args) {
        IStrategy strategyA = new StrategyA();
        strategyA.AbstractAlgorithm();
        
        IStrategy strategyB = new StrategyB();
        strategyB.AbstractAlgorithm();
    }
}
