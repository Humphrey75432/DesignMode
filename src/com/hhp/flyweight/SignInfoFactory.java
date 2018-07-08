package com.hhp.flyweight;

import java.util.HashMap;

/**
 * Created by Hu on 2017/11/17.
 */
public class SignInfoFactory {

    private static HashMap<String, SignInfo>pool =
            new HashMap<>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key+"建立对象，并放入对象池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key+"直接从池中获得");
        }
        return result;
    }
}
