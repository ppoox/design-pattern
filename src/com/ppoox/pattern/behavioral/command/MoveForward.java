package com.ppoox.pattern.behavioral.command;

public class MoveForward extends Command {
    private final int space;

    public MoveForward(int space) {
        this.space = space;
    }

    @Override
    public void execute() {
        robot.moveForward(space);
    }
}
