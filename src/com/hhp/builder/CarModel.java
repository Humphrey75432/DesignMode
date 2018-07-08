package com.hhp.builder;

import java.util.ArrayList;

/**
 * Created by Hu on 2017/8/20.
 */
public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void engineBoom();

    protected abstract void alarm();

    // 模板模式
    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if(actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if(actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engineBoom")) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }

}
