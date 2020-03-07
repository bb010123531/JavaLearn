package work.designpattern.factory.pay;

public class AliPay implements IPay{

    @Override
    public void pay() {
        System.out.println("ali pay");
    }

}
