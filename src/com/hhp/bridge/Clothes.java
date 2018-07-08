package com.hhp.bridge;

/**
 * Created by Hu on 2017/12/17.
 */
public class Clothes extends Product {

    @Override
    public void beProduced() {
        System.out.println("生产出来的衣服是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的衣服卖出去了...");
    }
}
