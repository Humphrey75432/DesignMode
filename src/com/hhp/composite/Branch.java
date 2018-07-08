package com.hhp.composite;

import java.util.ArrayList;

/**
 * Created by Hu on 2017/10/28.
 */
public class Branch implements IBranch {

    private ArrayList subordinateList = new ArrayList();
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称："+this.name;
        info = info + "\t职位："+this.position;
        info = info + "\t薪水："+this.salary;
        return info;
    }

    @Override
    public ArrayList<ICorp> getSubordinateInfo() {
        return this.subordinateList;
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }
}
