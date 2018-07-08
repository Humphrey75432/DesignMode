package com.hhp.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Hu on 2017/8/20.
 */
public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayerIH(player);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("开始游戏的时间是："+sdf.format(new Date()));
        ClassLoader c1 = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(c1, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束游戏的时间是："+sdf.format(new Date()));
    }

}
