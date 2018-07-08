package com.hhp.strategy;

/**
 * Created by Hu on 2017/10/24.
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，拦住追兵");
    }
}
