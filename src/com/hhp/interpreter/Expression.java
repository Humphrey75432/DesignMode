package com.hhp.interpreter;

import java.util.HashMap;

/**
 * Created by Hu on 2017/12/17.
 */
public abstract class Expression {

    public abstract int interpreter(HashMap<String, Integer> var);
}
