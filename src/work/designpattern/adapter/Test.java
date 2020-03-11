package work.designpattern.adapter;

import work.designpattern.adapter.adapters.LoginForQQAdapter;

public class Test {
    public static void main(String[] args) {
        ILogin adapter = new PassportForThirdAdapter2();
        System.out.println(adapter.processLogin("test", LoginForQQAdapter.class));
    }
}
