package com.hhp.abstractFactory;

/**
 * Created by Hu on 2017/8/6.
 */
public class MaleFactory implements HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
