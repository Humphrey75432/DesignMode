package com.hhp.observer;

/**
 * Created by Hu on 2017/10/29.
 */
public class LiSi implements Observer {

    @Override
    public void update(String str) {
        System.out.println("报告秦老板，韩非子开始活动了……");
        this.reportToQinShiHuang(str);
        System.out.println("李斯：汇报完毕……");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告秦老板，韩非有活动了---->"+reportContext);
    }
}
