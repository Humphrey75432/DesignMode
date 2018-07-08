package com.hhp.flyweight;

/**
 * Created by Hu on 2017/11/17.
 */
public class SignInfo4Pool extends SignInfo {

    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
