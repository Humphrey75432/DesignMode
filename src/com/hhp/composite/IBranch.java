package com.hhp.composite;

import java.util.ArrayList;

/**
 * Created by Hu on 2017/10/28.
 */
public interface IBranch extends ICorp{

    public ArrayList<ICorp> getSubordinateInfo();
    public void addSubordinate(ICorp corp);

}
