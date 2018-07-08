package com.hhp.command;

/**
 * Created by Hu on 2017/8/25.
 */
public abstract class Group {

    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void plan();

    public void rollback() {
        //根据事务的日志进行回滚
    }

}
