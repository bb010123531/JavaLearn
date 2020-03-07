package work.designpattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeContainerSinglton {
    private ThreadSafeContainerSinglton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {
        if (!ioc.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.putIfAbsent(className, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return ioc.get(className);
    }
}