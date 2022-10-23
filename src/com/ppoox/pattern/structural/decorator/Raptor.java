package com.ppoox.pattern.structural.decorator;

public class Raptor implements Fighter {
    @Override
    public void attack() {
        System.out.println("Raptor Attack!");
    }
}
