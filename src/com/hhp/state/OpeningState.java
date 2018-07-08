package com.hhp.state;

/**
 * Created by Hu on 2017/11/17.
 */
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯开门...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        //do nothing
    }

    @Override
    public void stop() {
        // do nothing
    }
}
