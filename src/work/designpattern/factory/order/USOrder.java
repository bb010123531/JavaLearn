package work.designpattern.factory.order;

public class USOrder implements IOrder{

    @Override
    public void create() {
        System.out.println("us create order");
    }

}
