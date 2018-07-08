package com.hhp.decorator;

/**
 * Created by Hu on 2017/10/24.
 */
public class HignScoreDecorator extends Decorator {

    public HignScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    public void reportHighScore() {
        System.out.println("这次考试语文最高是75分，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
