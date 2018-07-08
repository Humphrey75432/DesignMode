package com.hhp.decorator;

/**
 * Created by Hu on 2017/10/24.
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("我是排名38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
