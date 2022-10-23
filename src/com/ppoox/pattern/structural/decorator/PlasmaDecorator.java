package com.ppoox.pattern.structural.decorator;

public class PlasmaDecorator extends WeaponDecorator {
    public PlasmaDecorator(Fighter decoratedFighter) {
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Plasma attack");
    }
}
