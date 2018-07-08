package com.hhp.decorator;

/**
 * Created by Hu on 2017/10/22.
 */
public class FouthGradeSchoolReport extends SchoolReport {

    @Override
    public void report() {
        System.out.println("尊敬的家长：");
        System.out.println("......");
        System.out.println("语文62 数学65 体育98 自然63");
        System.out.println("......");
        System.out.println("家长签名：    ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
