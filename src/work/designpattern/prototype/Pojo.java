package work.designpattern.prototype;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojo implements Cloneable{
    private String name;
    private int age;

    private List<String> props;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getProps() {
        return props;
    }

    public void setProps(List<String> props) {
        this.props = props;
    }

    @Override
    public Pojo clone() throws CloneNotSupportedException {
        return (Pojo)super.clone();
    }

    public Pojo deepClone() throws JsonParseException, JsonMappingException, JsonProcessingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(objectMapper.writeValueAsString(this), Pojo.class);
    }
}
