package work.designpattern.adapter.adapters;

import work.designpattern.adapter.PassportService;
import work.designpattern.adapter.ResultMsg;

public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
