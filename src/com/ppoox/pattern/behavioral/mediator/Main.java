package com.ppoox.pattern.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        /**
         *  특정 이벤트에 의하여 관련된 다른 클래스에 전달하는 중재자 역할
         */
        ModeSwitch modeSwitch = new ModeSwitch();
        ModeMediator modeMediator = new ModeMediator();

        modeSwitch.setModeMediator(modeMediator);

        modeMediator.add(new ListView());
        modeMediator.add(new GalleryView());

        modeSwitch.toggleMode();
        System.out.println("==================================");
        modeSwitch.toggleMode();
        System.out.println("==================================");
        modeSwitch.toggleMode();
    }
}
