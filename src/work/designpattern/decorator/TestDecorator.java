package work.designpattern.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Module m = null;

        m = new BaseModule();
        System.out.println(m.name() + m.ownModules());

        m = new LoginMouduleDecorator(m);
        System.out.println(m.name() + m.ownModules());
    }
}
