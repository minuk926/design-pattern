package com.study.strategy.robot;

import java.awt.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.strategy.robot
 * fileName    : RobotMain
 * author      : limju
 * date        : 2024 11월 11
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 11   limju       최초 생성
 *
 * </pre>
 */
public class RobotMain {
    public static void main(String[] args) {
        RobotStrategy robot = new RobotStrategy(new MoveStrategyWalk(), new TemperatureStrategyCold());
        robot.move();
        robot.temperature();
    }
}
