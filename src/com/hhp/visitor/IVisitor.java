package com.hhp.visitor;

/**
 * Created by Hu on 2017/10/29.
 */
public interface IVisitor {

    public void visit(CommonEmployee commonEmployee);
    public void visit(Manager manager);
}
