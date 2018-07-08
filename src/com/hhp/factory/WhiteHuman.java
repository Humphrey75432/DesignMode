package com.hhp.factory;

/**
 * Created by Hu on 2017/8/3.
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白种人的皮肤是白色");
    }

    @Override
    public void talk() {
        System.out.println("白人会说话，一般是单字节的");
    }
}
