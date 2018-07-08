package com.hhp.facade;

/**
 * Created by Hu on 2017/10/29.
 */
public class Police {

    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess+"信件已经检查过了");
    }
}
