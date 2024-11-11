package com.study.strategy.robot;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : TemperatureStrategyHot
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class TemperatureStrategyHot implements ITemperatureStrategy {
    @Override
    public void temperature() {
        System.out.println("TemperatureStrategyHot");
    }
}