package work.designpattern.factory;

import work.designpattern.factory.pay.IPay;

public abstract class AbstractChinesePayFactory implements IPayFactory {

    abstract IPay readlPay();

    @Override
    public IPay pay() {
        System.out.println("check check in china");
        return readlPay();
    }
}
