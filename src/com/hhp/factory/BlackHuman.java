package com.hhp.factory;

/**
 * Created by Hu on 2017/8/3.
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑人的皮肤是黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，但是一般听不懂");
    }
}
