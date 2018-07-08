package com.hhp.mediator;

/**
 * Created by Hu on 2017/8/25.
 */
public class Stock extends AbstractColleague{

    private static int COMPUTER_NUMBER = 10;

    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量增加为："+COMPUTER_NUMBER);
    }

    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量减少为"+COMPUTER_NUMBER);
    }

    public void clearStock() {
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

}
