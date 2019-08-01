package com.hhp.factory;

/**
 * Created by Hu on 2017/8/3.
 */
public class NvWa {

    public static void main(String[] args) {
        // 23242
        System.out.println("第一次造人，火候不够，白人诞生");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("第二次造人，火候超过，黑人诞生");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("第三次造人，火候正好，黄人诞生");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
