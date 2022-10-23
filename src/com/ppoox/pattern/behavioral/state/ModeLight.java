package com.ppoox.pattern.behavioral.state;

public class ModeLight implements ModeState {
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("Switch light mode");
        modeSwitch.setMode(new ModeDark());
    }
}
