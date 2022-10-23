package com.ppoox.pattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
        /**
         * 객체의 결합을 통해 기능을 동적으로 유연하게 확장할 수 있게 해주는 패턴
         */
        new PlasmaDecorator(
                new LaserDecorator(
                        new MissileDecorator(
                                new Raptor()
                        )
                )
        ).attack();
    }
}
