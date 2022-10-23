package com.ppoox.pattern.structural.decorator;

public class LaserDecorator extends WeaponDecorator {
    public LaserDecorator(Fighter decoratedFighter) {
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Laser attack");
    }
}
