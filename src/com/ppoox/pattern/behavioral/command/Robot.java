package com.ppoox.pattern.behavioral.command;

public class Robot {

    public enum Direction { LEFT, RIGHT }

    public void moveForward(int space) {
        System.out.println("Move forward to " + space);
    }

    public void turn(Direction direction) {
        System.out.println("Turn " + direction);
    }

    public void pickUp() {
        System.out.println("Pick up");
    }
}
