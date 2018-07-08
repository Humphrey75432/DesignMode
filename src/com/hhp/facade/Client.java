package com.hhp.facade;

/**
 * Created by Hu on 2017/10/29.
 */
public class Client {

    public static void main(String[] args) {

        ModernPostOffice postOffice = new ModernPostOffice();
        String address = "Happy Road, No.666, God Province, Heaven";
        String context = "Hello, It's me, do you know who I am? I'm your old sister...";
        postOffice.sendLetter(context, address);
    }

}
