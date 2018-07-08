package com.hhp.iterator;

/**
 * Created by Hu on 2017/10/26.
 */
public interface IProject {

    public void add(String name, int num, int cost);
    public String getProjectInfo();
    public ProjectIterator iterator();


}
