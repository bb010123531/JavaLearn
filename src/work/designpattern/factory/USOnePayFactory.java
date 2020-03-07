package work.designpattern.factory;

import work.designpattern.factory.order.IOrder;
import work.designpattern.factory.order.USOrder;
import work.designpattern.factory.pay.IPay;
import work.designpattern.factory.pay.USPay;

public class USOnePayFactory extends AbstractUSPayFactory{

    @Override
    public IOrder createOrder() {
        return new USOrder();
    }

    @Override
    void beforePayCheckInUs() {
        System.out.println("check in us balabala");
    }

    @Override
    IPay readlPay() {
        return new USPay();
    }
}
