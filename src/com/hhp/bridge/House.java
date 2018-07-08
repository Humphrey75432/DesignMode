package com.hhp.bridge;

/**
 * Created by Hu on 2017/12/17.
 */
public class House extends Product {

    @Override
    public void beProduced() {
        System.out.println("生产出来的房子是这样的");
    }

    @Override
    public void beSelled() {
        System.out.println("产生出来的房子卖出去了");
    }
}
