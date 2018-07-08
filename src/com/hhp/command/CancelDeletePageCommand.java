package com.hhp.command;

/**
 * Created by Hu on 2017/8/25.
 */
public class CancelDeletePageCommand extends Command {

    @Override
    public void execute() {
        super.pg.rollback();
    }
}
