package com.ppoox.pattern.creational.factory;

public abstract class Component {

    protected abstract String getComponentName();

    public Component() {
        System.out.println(getComponentName() + " is created");
    }
}
