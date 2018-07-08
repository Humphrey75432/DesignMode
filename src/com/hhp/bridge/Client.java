package com.hhp.bridge;

/**
 * Created by Hu on 2017/12/17.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("房地产公司是这样运作的");
        HouseCorp houseCorp = new HouseCorp(new House());
        houseCorp.makeMoney();

        System.out.println("iPod公司是这样运作的");
        IPodCorp iPodCorp = new IPodCorp(new IPod());
        iPodCorp.makeMoney();

        System.out.println("服装公司是这样运作的");
        ClothesCorp clothesCorp = new ClothesCorp(new Clothes());
        clothesCorp.makeMoney();
    }
}
