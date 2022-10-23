package com.ppoox.pattern.behavioral.state;

public class ModeDark implements ModeState {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("Switch dark mode");
        modeSwitch.setMode(new ModeLight());
    }
}
