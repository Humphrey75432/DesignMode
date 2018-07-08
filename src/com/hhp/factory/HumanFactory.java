package com.hhp.factory;

/**
 * Created by Hu on 2017/8/3.
 */
public class HumanFactory {


    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
