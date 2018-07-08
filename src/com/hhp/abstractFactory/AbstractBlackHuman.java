package com.hhp.abstractFactory;

/**
 * Created by Hu on 2017/8/6.
 */
public abstract class AbstractBlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑人的皮肤是黑色的");
    }


    @Override
    public void talk() {
        System.out.println("黑色人种会说话，一般听不懂");
    }
}
