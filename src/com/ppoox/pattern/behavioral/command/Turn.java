package com.ppoox.pattern.behavioral.command;

public class Turn extends Command {

    private Robot.Direction direction;

    public Turn(Robot.Direction direction) {
        this.direction = direction;
    }

    @Override
    public void execute() {
        robot.turn(direction);
    }
}
