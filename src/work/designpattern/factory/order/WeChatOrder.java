package work.designpattern.factory.order;

public class WeChatOrder implements IOrder{

    @Override
    public void create() {
        System.out.println("weixin create order");
    }
}
