package com.ppoox.pattern.behavioral.state;

public class Main {
    public static void main(String[] args) {
        /**
         * 객체의 상태에 따라 객체의 행위 내용을 변경해주는 패턴
         */
        final ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
    }
}
