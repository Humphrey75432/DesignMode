package com.hhp.adapter;

/**
 * Created by Hu on 2017/10/25.
 */
public class UserInfo implements IUserInfo {

    @Override
    public String getHomeAddress() {
        System.out.println("这是员工的家庭地址");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这是员工的家庭电话");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这个人的手机号码是000……");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室的电话号码是...");
        return null;
    }

    @Override
    public String getUsername() {
        System.out.println("姓名是");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个人的职位是BOSS");
        return null;
    }
}
