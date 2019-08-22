import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        InputStream resourceAsStream = PropertiesDemo.class.getClassLoader().getResourceAsStream("test.property");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        Object clazz = properties.get("clazz");
        System.out.println(clazz);
    }
}
