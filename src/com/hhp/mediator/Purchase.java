package com.hhp.mediator;

/**
 * Created by Hu on 2017/8/25.
 */
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }

}
