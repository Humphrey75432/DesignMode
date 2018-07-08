package com.hhp.singleton;

/**
 * Created by Hu on 2017/8/2.
 */
public class Emperor {

    private static final Emperor emperor = new Emperor();

//    使用私有的构造函数，只允许在内存中产生一个对象实例
    private Emperor () {}
//    返回该对象实例
    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我是皇帝");
    }

}
