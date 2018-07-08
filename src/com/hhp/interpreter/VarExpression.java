package com.hhp.interpreter;

import java.util.HashMap;

/**
 * Created by Hu on 2017/12/17.
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
