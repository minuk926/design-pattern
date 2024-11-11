package com.study.strategy;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : StrategyAlgorithm
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class StrategyAlgorithmA {
    IStrategy strategy;
    
    public StrategyAlgorithmA(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.AbstractAlgorithm();
    }
}
