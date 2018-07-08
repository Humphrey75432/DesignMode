package com.hhp.factory;

/**
 * Created by Hu on 2017/8/3.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话，一般是双字节的");
    }
}


