package com.ppoox.pattern.behavioral.command;

public class PickUp extends Command {
    @Override
    public void execute() {
        robot.pickUp();
    }
}
