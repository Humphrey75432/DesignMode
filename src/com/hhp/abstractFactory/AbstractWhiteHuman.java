package com.hhp.abstractFactory;

/**
 * Created by Hu on 2017/8/6.
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白人的皮肤是白色的");
    }


    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般是单字节的");
    }
}
