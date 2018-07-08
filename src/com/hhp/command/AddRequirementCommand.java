package com.hhp.command;

/**
 * Created by Hu on 2017/8/25.
 */
public class AddRequirementCommand extends Command {

    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.pg.add();
        super.cg.add();
        super.rg.plan();
    }
}
