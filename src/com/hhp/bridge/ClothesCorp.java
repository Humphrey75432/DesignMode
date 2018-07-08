package com.hhp.bridge;

/**
 * Created by Hu on 2017/12/17.
 */
public class ClothesCorp extends Corp {

    public ClothesCorp(Clothes clothes) {
        super(clothes);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚钱了");
    }
}
