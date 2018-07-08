package com.hhp.responseChain;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Hu on 2017/8/25.
 */
public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //责任链的设置
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
            father.handlerMessage(women);
        }
    }

}
