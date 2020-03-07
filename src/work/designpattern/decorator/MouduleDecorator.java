package work.designpattern.decorator;

public abstract class MouduleDecorator extends Module{

    private Module module;

    public MouduleDecorator(Module module) {
        this.module = module;
    }

    @Override
    public String name() {
        return module.name();
    }

    @Override
    public String ownModules() {
        return module.ownModules();
    }
}
