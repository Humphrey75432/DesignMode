package com.hhp.template;

/**
 * Created by Hu on 2017/8/13.
 */
public class HummerH2Model extends HummerModel {

    @Override
    protected void start() {
        System.out.println("悍马H2启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2的引擎声是这样的");
    }

    protected boolean isAlarm() {
        return false;
    }

}
