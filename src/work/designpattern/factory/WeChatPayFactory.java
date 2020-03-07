package work.designpattern.factory;

import work.designpattern.factory.order.IOrder;
import work.designpattern.factory.order.WeChatOrder;
import work.designpattern.factory.pay.IPay;
import work.designpattern.factory.pay.WeChatPay;

public class WeChatPayFactory extends AbstractChinesePayFactory{

    @Override
    public IOrder createOrder() {
        return new WeChatOrder();
    }

    @Override
    public IPay readlPay() {
        return new WeChatPay();
    }
}
