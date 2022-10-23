package com.ppoox.pattern.structural.adapter;

import com.ppoox.pattern.behavioral.command.Command;

public class OrderAdapter extends Command {

    private final Order order;

    public OrderAdapter(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.run(robot);
    }
}
