package com.ppoox.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class RobotKit {

    private final Robot robot = new Robot();
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void start() {
        for (Command command : commands) {
            command.setRobot(robot);
            command.execute();
        }
    }

}
