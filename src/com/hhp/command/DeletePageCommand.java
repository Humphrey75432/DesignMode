package com.hhp.command;

/**
 * Created by Hu on 2017/8/25.
 */
public class DeletePageCommand extends Command {

    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.rg.delete();
        super.cg.delete();
        super.pg.plan();
    }
}
