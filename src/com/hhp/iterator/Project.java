package com.hhp.iterator;

import java.util.ArrayList;

/**
 * Created by Hu on 2017/10/26.
 */
public class Project implements IProject {

    private ArrayList<IProject> projectList = new ArrayList<>();

    private String name = "";
    private int num = 0;
    private int cost = 0;

    public Project() {
    }

    private Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称：" + this.name;
        info = info + "\t项目人数：" + this.num;
        info = info + "\t项目费用：" + this.cost;
        return info;
    }

    @Override
    public ProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
