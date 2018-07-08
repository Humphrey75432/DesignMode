package com.hhp.responseChain;

/**
 * Created by Hu on 2017/8/25.
 */
public class Women implements IWomen {

    private int type = 0;
    private String request = "";

    public Women(int _type, String _request) {
        this.type = _type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是："+_request;
            case 2:
                this.request = "妻子的请求是："+_request;
            case 3:
                this.request = "母亲的请求是： "+_request;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
