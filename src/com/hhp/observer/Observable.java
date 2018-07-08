package com.hhp.observer;

/**
 * Created by Hu on 2017/10/29.
 */
public interface Observable {

    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver(String context);
}
