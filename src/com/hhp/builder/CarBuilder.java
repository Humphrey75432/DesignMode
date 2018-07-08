package com.hhp.builder;

import java.util.ArrayList;

/**
 * Created by Hu on 2017/8/20.
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();

}
