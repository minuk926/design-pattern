package com.study.strategy.robot;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy
 * fileName    : RobotStrategyMain
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class RobotStrategy {
    private IMoveStrategy moveStrategy;
    private ITemperatureStrategy temperatureStrategy;

    public RobotStrategy(IMoveStrategy moveStrategy, ITemperatureStrategy temperatureStrategy) {
        this.moveStrategy = moveStrategy;
        this.temperatureStrategy = temperatureStrategy;
    }

    public void move() {
        moveStrategy.move();
    }

    public void temperature() {
        temperatureStrategy.temperature();
    }
}
