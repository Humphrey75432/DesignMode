package com.hhp.template;

/**
 * Created by Hu on 2017/8/13.
 */
public abstract class HummerModel {

    protected abstract void start(); //汽车启动

    protected abstract void stop(); //汽车停车

    protected abstract void alarm(); //汽车鸣笛

    protected abstract void engineBoom(); //汽车的引擎声

    //要想让车跑起来需要这样安排
    public final void run() {
        this.start(); //发动汽车
        this.engineBoom(); //引擎声轰鸣
       if(this.isAlarm()) {
           this.alarm();
       }
        this.stop(); //到达目的地后停车
    };

    //钩子方法
    protected boolean isAlarm() {
        return true;
    }

}
