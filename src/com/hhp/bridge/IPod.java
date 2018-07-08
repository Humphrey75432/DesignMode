package com.hhp.bridge;

/**
 * Created by Hu on 2017/12/17.
 */
public class IPod extends Product {

    @Override
    public void beProduced() {
        System.out.println("生产出来的iPod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的iPod卖出去了...");
    }
}
