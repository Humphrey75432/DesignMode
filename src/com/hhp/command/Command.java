package com.hhp.command;

/**
 * Created by Hu on 2017/8/25.
 */
public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();

}
