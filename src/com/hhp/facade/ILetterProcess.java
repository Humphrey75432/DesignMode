package com.hhp.facade;

/**
 * Created by Hu on 2017/10/29.
 */
public interface ILetterProcess {

    public void writeContext(String context);
    public void fillEnvelope(String address);
    public void letterIntoEnvelope();
    public void sendLetter();
}
