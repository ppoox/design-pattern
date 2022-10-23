package com.ppoox.pattern.behavioral.state;

public class ModeSwitch {
    private ModeState modeState;

    public ModeSwitch() {
        this.modeState = new ModeLight();
    }

    public void onSwitch() {
        modeState.toggle(this);
    }

    public void setMode(ModeState state) {
        this.modeState = state;
    }
}
