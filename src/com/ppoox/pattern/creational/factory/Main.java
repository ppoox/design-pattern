package com.ppoox.pattern.creational.factory;

public class Main {

    private static final ComponentFactory componentFactory = new ComponentFactory();

    public static void main(String[] args) {
        /**
         *  객체 생성 처리를 서브 클래스로 분리해 처리하도록 캡슐화하는 패턴
         */
        Component component1 = componentFactory.getComponent(Usage.PRESS);
        Component component2 = componentFactory.getComponent(Usage.TOGGLE);
        Component component3 = componentFactory.getComponent(Usage.EXPAND);

        // Decorator + Factory
        FighterFactory fighterFactory = new FighterFactory();

        fighterFactory.getFighter(true, false, false).attack();
        fighterFactory.getFighter(true, true, false).attack();
        fighterFactory.getFighter(true, false, true).attack();
    }
}
