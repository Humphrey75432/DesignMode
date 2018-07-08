package com.hhp.bridge;

/**
 * Created by Hu on 2017/12/17.
 */
public class IPodCorp extends Corp {

    public IPodCorp(IPod iPod) {
        super(iPod);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我生产的iPod赚钱啦");
    }
}
