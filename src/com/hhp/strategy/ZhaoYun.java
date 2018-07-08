package com.hhp.strategy;

/**
 * Created by Hu on 2017/10/24.
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;
        System.out.println("----刚到吴国拆开第一个锦囊----");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("----刘备乐不思蜀了，拆开第二个----");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("----孙权的小追兵来了，拆开第三个----");
        context = new Context(new BlockEnemy());
        context.operate();
    }

}
