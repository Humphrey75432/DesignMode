package com.hhp.abstractFactory;

/**
 * Created by Hu on 2017/8/6.
 */
public abstract class AbstractYellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄人的皮肤是黄色的");
    }


    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般是双字节的");
    }
}
