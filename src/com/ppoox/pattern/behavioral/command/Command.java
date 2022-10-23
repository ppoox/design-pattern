package com.ppoox.pattern.behavioral.command;

public abstract class Command {

    protected Robot robot;

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public abstract void execute();

}
