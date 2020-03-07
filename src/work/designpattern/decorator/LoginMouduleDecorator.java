package work.designpattern.decorator;

public class LoginMouduleDecorator extends MouduleDecorator {

    public LoginMouduleDecorator(Module module) {
        super(module);
    }

    @Override
    public String name() {
        return super.name() + " login";
    }

    @Override
    public String ownModules() {
        return super.ownModules() + " 作业 题库 成长墙";
    }
}
