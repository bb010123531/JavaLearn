package work.designpattern.adapter;

import com.sun.org.apache.bcel.internal.generic.ILOAD;
import work.designpattern.adapter.adapters.*;

public class PassportForThirdAdapter2 implements ILogin {
    public ResultMsg processLogin(String id,Class<? extends ILoginAdapter> clazz){
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
