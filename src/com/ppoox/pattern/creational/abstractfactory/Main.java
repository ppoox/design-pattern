package com.ppoox.pattern.creational.abstractfactory;

import com.ppoox.pattern.creational.factory.Usage;

public class Main {
    public static void main(String[] args) {
        /**
         * 구제적인 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를 제공하는 패턴
         */

        new DarkComponentFactory().getComponent(Usage.PRESS);
        new LightComponentFactory().getComponent(Usage.PRESS);
    }
}
