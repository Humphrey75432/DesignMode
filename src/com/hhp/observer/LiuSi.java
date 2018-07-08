package com.hhp.observer;

/**
 * Created by Hu on 2017/10/29.
 */
public class LiuSi implements Observer {

    @Override
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了……");
        this.happy(context);
        System.out.println("刘斯：乐死了\n");
    }

    private void happy(String context) {
        System.out.println("王斯：因为"+context+"， --所以我快乐啊");
    }
}
