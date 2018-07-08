package com.hhp.abstractFactory;

/**
 * Created by Hu on 2017/8/6.
 */
public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();

        System.out.println("生产一个黄种男人");
        Human maleYellowHuman = maleFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

        System.out.println("生产一个黄种女人");
        Human femaleYellowHuman = femaleFactory.createYellowHuman();
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();

        System.out.println("生产一个白种男人");
        Human maleWhiteHuman = maleFactory.createWhiteHuman();
        maleWhiteHuman.getColor();
        maleWhiteHuman.getSex();
        maleWhiteHuman.talk();

        System.out.println("生产一个白种女人");
        Human femaleWhiteHuman = femaleFactory.createWhiteHuman();
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.getSex();
        femaleWhiteHuman.talk();

        System.out.println("生产一个黑种男人");
        Human maleBlackHuman = maleFactory.createBlackHuman();
        maleBlackHuman.getColor();
        maleBlackHuman.getSex();
        maleBlackHuman.talk();

        System.out.println("生产一个黑种女人");
        Human femaleBlackHuman = femaleFactory.createBlackHuman();
        femaleBlackHuman.getColor();
        femaleBlackHuman.getSex();
        femaleBlackHuman.talk();
    }

}
