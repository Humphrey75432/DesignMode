package com.hhp.adapter;

/**
 * Created by Hu on 2017/10/25.
 */
public class Client {

    public static void main(String[] args) {

        IUserInfo youngGirl = new UserInfo();
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }

    }
}