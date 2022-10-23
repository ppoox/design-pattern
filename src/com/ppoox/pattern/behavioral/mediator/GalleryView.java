package com.ppoox.pattern.behavioral.mediator;

public class GalleryView implements ModeListener {
    @Override
    public void onModeChange(Mode mode) {
        System.out.println("Gallery mode is " + mode.name());
    }
}
