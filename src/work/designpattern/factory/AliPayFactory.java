package work.designpattern.factory;

import work.designpattern.factory.order.AliOrder;
import work.designpattern.factory.order.IOrder;
import work.designpattern.factory.pay.AliPay;
import work.designpattern.factory.pay.IPay;

public class AliPayFactory extends AbstractChinesePayFactory{

    @Override
    public IOrder createOrder() {
        return new AliOrder();
    }

    @Override
    IPay readlPay() {
        return new AliPay();
    }

}
