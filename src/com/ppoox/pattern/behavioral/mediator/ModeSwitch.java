package com.ppoox.pattern.behavioral.mediator;

public class ModeSwitch {
    private Mode mode = Mode.LIST;
    private ModeMediator modeMediator;

    public void setModeMediator(ModeMediator modeMediator) {
        this.modeMediator = modeMediator;
    }

    public void toggleMode() {
        mode = mode == Mode.LIST ? Mode.GALLERY : Mode.LIST;

        if (modeMediator != null) {
            modeMediator.onModeChange(mode);
        }
    }
}
