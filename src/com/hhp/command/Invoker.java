package com.hhp.command;

/**
 * Created by Hu on 2017/8/25.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }

}
