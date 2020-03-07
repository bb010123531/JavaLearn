package work.designpattern.factory.order;

public class AliOrder implements IOrder{

    @Override
    public void create() {
        System.out.println("ali order");
    }
}
