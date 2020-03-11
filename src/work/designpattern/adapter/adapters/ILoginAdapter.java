package work.designpattern.adapter.adapters;

import work.designpattern.adapter.ResultMsg;

public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
