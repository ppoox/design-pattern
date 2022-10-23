package com.ppoox.pattern.structural.decorator;

public abstract class WeaponDecorator implements Fighter {

    private final Fighter decoratedFighter;

    public WeaponDecorator(Fighter decoratedFighter) {
        this.decoratedFighter = decoratedFighter;
    }

    @Override
    public void attack() {
        decoratedFighter.attack();
    }
}
