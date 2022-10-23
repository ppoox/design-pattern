package com.ppoox.pattern.creational.factory;

import com.ppoox.pattern.structural.decorator.*;

public class FighterFactory {

    public Fighter getFighter(boolean missile, boolean laser, boolean plasma) {
        Fighter raptor = new Raptor();
        if (missile) {
            raptor = new MissileDecorator(raptor);
        }
        if (laser) {
            raptor = new LaserDecorator(raptor);
        }
        if (plasma) {
            raptor = new PlasmaDecorator(raptor);
        }
        return raptor;
    }
}
