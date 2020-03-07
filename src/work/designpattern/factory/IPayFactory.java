package work.designpattern.factory;

import work.designpattern.factory.order.IOrder;
import work.designpattern.factory.pay.IPay;

public interface IPayFactory {
    IOrder createOrder();
    IPay pay();
}
