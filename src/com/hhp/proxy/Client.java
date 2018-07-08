package com.hhp.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Hu on 2017/8/20.
 */
public class Client {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        IGamePlayer player = new GamePlayer("张三");
//     IGamePlayer proxy = new GamePlayerProxy(player); //不是指定代理，不能访问
        IGamePlayer proxy = player.getProxy(); //使用指定代理访问角色
        System.out.println("开始游戏的时间是："+sdf.format(new Date()));
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束游戏的时间是："+sdf.format(new Date()));
    }

}
