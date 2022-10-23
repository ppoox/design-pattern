package com.ppoox.pattern.creational.abstractfactory;

import com.ppoox.pattern.creational.factory.*;

public class DarkComponentFactory implements ComponentFactory {
    @Override
    public Component getComponent(Usage usage) {
        switch (usage) {
            case PRESS:
                return new Button();
            case TOGGLE:
                return new Switch();
            case EXPAND:
                return new Dropdown();
            default:
                throw new IllegalArgumentException("Invalid Usage");
        }
    }
}
