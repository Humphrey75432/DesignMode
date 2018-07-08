package com.hhp.bridge;

/**
 * Created by Hu on 2017/12/17.
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProduced();
        this.product.beSelled();
    }
}
