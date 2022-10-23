package com.ppoox.pattern.structural.decorator;

public class MissileDecorator extends WeaponDecorator {
    public MissileDecorator(Fighter decoratedFighter) {
        super(decoratedFighter);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Missile attack");
    }
}
