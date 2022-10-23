package com.ppoox.pattern.behavioral.command;

import com.ppoox.pattern.structural.adapter.MoveBackOrder;
import com.ppoox.pattern.structural.adapter.OrderAdapter;

public class Main {
    public static void main(String[] args) {
        /**
         * 실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴
         */
        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForward(3));
        robotKit.addCommand(new Turn(Robot.Direction.LEFT));

        robotKit.addCommand(new MoveForward(5));
        robotKit.addCommand(new Turn(Robot.Direction.RIGHT));

        robotKit.addCommand(new PickUp());

        robotKit.addCommand(new OrderAdapter(new MoveBackOrder(4)));

        robotKit.start();
    }
}
