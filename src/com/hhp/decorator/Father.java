package com.hhp.decorator;

/**
 * Created by Hu on 2017/10/22.
 */
public class Father {

    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HignScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("张三");
    }

}
