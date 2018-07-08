package com.hhp.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Hu on 2017/8/20.
 */
public class GamePlayerIH implements InvocationHandler {

    //Class cls = null;

    Object obj = null;

    public GamePlayerIH(Object _obj) {
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }

}
