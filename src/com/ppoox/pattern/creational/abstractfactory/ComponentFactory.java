package com.ppoox.pattern.creational.abstractfactory;

import com.ppoox.pattern.creational.factory.Component;
import com.ppoox.pattern.creational.factory.Usage;

public interface ComponentFactory {
    public Component getComponent(Usage usage);
}
