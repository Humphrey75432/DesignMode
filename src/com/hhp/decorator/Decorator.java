package com.hhp.decorator;

/**
 * Created by Hu on 2017/10/24.
 */
public abstract class Decorator extends SchoolReport {

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    public void report() {
        this.sr.report();
    }

    public void sign(String name) {
        this.sr.sign(name);
    }

}
