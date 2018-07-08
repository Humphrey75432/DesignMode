package com.hhp.builder;

/**
 * Created by Hu on 2017/8/20.
 */
public class BMWModel extends CarModel{

    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车应该这样停车...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声是这个样子的...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车喇叭是这个样子的...");
    }
}




