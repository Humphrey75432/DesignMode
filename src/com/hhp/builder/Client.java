package com.hhp.builder;

import java.util.ArrayList;

/**
 * Created by Hu on 2017/8/20.
 */
public class Client {

    public static void main(String[] args) {
       Director director = new Director();

       for(int i = 0; i < 10000; i++) {
           director.getABenzModel().run();
       }

       for (int i = 0; i < 1000; i++) {
           director.getBBenzModel().run();
       }

       for(int i = 0; i < 100; i++) {
           director.getCBMWModel().run();
       }

    }

}
