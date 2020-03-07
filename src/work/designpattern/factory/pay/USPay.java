package work.designpattern.factory.pay;

public class USPay implements IPay{

    @Override
    public void pay() {
        System.out.println("us pay");
    }
}
