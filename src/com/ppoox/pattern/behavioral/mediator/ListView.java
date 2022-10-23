package com.ppoox.pattern.behavioral.mediator;

public class ListView implements ModeListener {
    @Override
    public void onModeChange(Mode mode) {
        System.out.println("List mode is " + mode.name());
    }
}
