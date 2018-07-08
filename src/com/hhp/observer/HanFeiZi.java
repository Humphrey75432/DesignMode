package com.hhp.observer;

import java.util.ArrayList;

/**
 * Created by Hu on 2017/10/29.
 */
public class HanFeiZi implements Observable, IHanFeiZi {

    private boolean isHavingBreakfast = false;
    private boolean isHavingFun = false;
    private ArrayList<Observer>observerList = new ArrayList<>();

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }

    @Override
    public void haveBreakFast() {
        System.out.println("韩非子：开始吃早饭了……");
        this.notifyObserver("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了……");
        this.notifyObserver("韩非子在娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }
}
