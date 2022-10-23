package com.ppoox.pattern.structural.adapter;

import com.ppoox.pattern.behavioral.command.Robot;

public interface Order {
    void run(Robot robot);
}
