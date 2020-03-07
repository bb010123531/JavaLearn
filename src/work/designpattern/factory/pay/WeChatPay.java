package work.designpattern.factory.pay;

public class WeChatPay implements IPay{

    @Override
    public void pay() {
        System.out.println("weixin pay");
    }
}
