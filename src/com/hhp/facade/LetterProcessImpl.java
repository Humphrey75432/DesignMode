package com.hhp.facade;

/**
 * Created by Hu on 2017/10/29.
 */
public class LetterProcessImpl implements ILetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容……"+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人的地址和姓名……"+address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信件放入信箱中……");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件……");
    }
}
