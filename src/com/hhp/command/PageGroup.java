package com.hhp.command;

/**
 * Created by Hu on 2017/8/25.
 */
public class PageGroup extends Group {

    @Override
    public void find() {
        System.out.println("找到页面组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项页面...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项页面...");
    }

    @Override
    public void change() {
        System.out.println("客户要求改变一项页面...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划...");
    }
}
