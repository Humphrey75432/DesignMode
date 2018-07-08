package com.hhp.proxy;

/**
 * Created by Hu on 2017/8/20.
 */
public interface IGamePlayer {

    public void login(String user, String password);

    public void killBoss();

    public void upgrade();

    //强制代理，访问真实对象，返回代理对象
    public IGamePlayer getProxy();

}
