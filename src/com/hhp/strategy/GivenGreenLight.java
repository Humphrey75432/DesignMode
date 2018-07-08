package com.hhp.strategy;

/**
 * Created by Hu on 2017/10/24.
 */
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行");
    }
}
