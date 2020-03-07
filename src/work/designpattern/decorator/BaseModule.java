package work.designpattern.decorator;

public class BaseModule extends Module{
    @Override
    public String name() {
        return "base module";
    }

    @Override
    public String ownModules() {
        return "问答 文章 精品课 冒泡 商城";
    }
}
