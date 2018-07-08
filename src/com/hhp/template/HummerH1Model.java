package com.hhp.template;

/**
 * Created by Hu on 2017/8/13.
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1的引擎声是这样的");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
