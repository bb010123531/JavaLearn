package work.designpattern.decorator;

public class AdminModuleDecorator extends MouduleDecorator{

    public AdminModuleDecorator(Module module) {
        super(module);
    }

    @Override
    public String name() {
        return super.name() + " admin";
    }

    @Override
    public String ownModules() {
        return super.ownModules() + " 管理";
    }
}
