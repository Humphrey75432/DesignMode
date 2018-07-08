package com.hhp.responseChain;

/**
 * Created by Hu on 2017/8/25.
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int _level) {
        this.level = _level;
    }

    public final void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if(this.nextHandler != null) {
                this.nextHandler.handlerMessage(women);
            } else {
//                已无后续角色，无需处理
                System.out.println("====没地方请示了，按不同意处理====");
            }
        }
    }

    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);

}
