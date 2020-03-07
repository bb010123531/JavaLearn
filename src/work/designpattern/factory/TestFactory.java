package work.designpattern.factory;

public class TestFactory {

    public static void main(String[] args) {
        AliPayFactory alipay = new AliPayFactory();
        alipay.createOrder().create();
        alipay.pay().pay();
    }

}
