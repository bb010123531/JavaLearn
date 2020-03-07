package work.designpattern.factory;

import work.designpattern.factory.pay.IPay;

public abstract class AbstractUSPayFactory implements IPayFactory{

    abstract void beforePayCheckInUs();
    abstract IPay readlPay();

    @Override
    public IPay pay() {
        beforePayCheckInUs();
        return readlPay();
    }
}
