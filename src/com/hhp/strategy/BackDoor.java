package com.hhp.strategy;

/**
 * Created by Hu on 2017/10/24.
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权压力");
    }
}
