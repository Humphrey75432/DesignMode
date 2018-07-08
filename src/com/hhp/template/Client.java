package com.hhp.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Hu on 2017/8/13.
 */
public class Client {

    public static void main(String[] args) throws IOException{

        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        HummerH1Model h1 = new HummerH1Model();
        if(type.equals("0")) {
            h1.setAlarm(false);
        }
        h1.run();
        System.out.println("\n");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }


}
