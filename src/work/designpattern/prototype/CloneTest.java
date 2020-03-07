package work.designpattern.prototype;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException, JsonParseException, JsonMappingException, JsonProcessingException, IOException {

        Pojo p1 = new Pojo();
        p1.setAge(10);
        p1.setName("first");
        p1.setProps(Arrays.asList("a1", "a2"));

        Pojo p2 = p1.clone();
        Pojo p3 = p1.deepClone();

        System.out.println("============浅克隆===============");
        System.out.println(p1 == p2);
        System.out.println(p1.getProps() == p2.getProps());

        System.out.println("============深克隆===============");
        System.out.println(p1 == p3);
        System.out.println(p1.getProps() == p3.getProps());
    }

}
