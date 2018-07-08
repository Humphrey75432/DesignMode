package com.hhp.command;

/**
 * Created by Hu on 2017/8/25.
 */
public class Client {

    public static void main(String[] args) {
        Invoker xiaoSan = new Invoker();
//        System.out.println("====客户要求增加一项需求====");
//        Command command = new AddRequirementCommand();
//        xiaoSan.setCommand(command);
//        xiaoSan.action();
        System.out.println("====客户要求删除一项页面====");
        Command deletePage = new DeletePageCommand();
        xiaoSan.setCommand(deletePage);
        xiaoSan.action();
    }
}
