package com.hhp.strategy;

/**
 * Created by Hu on 2017/10/24.
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }

}
