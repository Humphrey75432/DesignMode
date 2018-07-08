package com.hhp.observer;

/**
 * Created by Hu on 2017/10/29.
 */
public class Client {

    public static void main(String[] args) {

        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();
        HanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);

        hanFeiZi.haveBreakFast();
        hanFeiZi.haveFun();
    }

}
