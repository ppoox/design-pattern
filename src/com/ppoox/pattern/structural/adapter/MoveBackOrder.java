package com.ppoox.pattern.structural.adapter;

import com.ppoox.pattern.behavioral.command.Robot;

public class MoveBackOrder implements Order {
    private final int block;

    public MoveBackOrder(int block) {
        this.block = block;
    }

    @Override
    public void run(Robot robot) {
        System.out.println("Move back start, block is " + block);
        System.out.println("Turn around");
        robot.turn(Robot.Direction.LEFT);
        robot.turn(Robot.Direction.LEFT);
        System.out.println("Go away");
        robot.moveForward(block);
    }
}
