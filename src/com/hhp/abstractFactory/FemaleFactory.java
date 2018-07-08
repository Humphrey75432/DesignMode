package com.hhp.abstractFactory;

/**
 * Created by Hu on 2017/8/6.
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
