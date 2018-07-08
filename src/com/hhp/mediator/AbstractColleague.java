package com.hhp.mediator;

/**
 * Created by Hu on 2017/8/25.
 */
public class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
