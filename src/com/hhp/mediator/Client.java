package com.hhp.mediator;

/**
 * Created by Hu on 2017/8/25.
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("----采购电脑的人员----");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        System.out.println("----销售电脑的人员----");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("----库房管理人员清理库存----");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }

}
