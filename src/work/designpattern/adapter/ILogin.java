package work.designpattern.adapter;

import work.designpattern.adapter.adapters.ILoginAdapter;

public interface ILogin {
    ResultMsg processLogin(String openId, Class<? extends ILoginAdapter> adapter);
}
