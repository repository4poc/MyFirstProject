import org.apache.commons.lang3.StringUtils;


public class HelloWorld{

    public void sayHello(){
        System.out.println("Hello world");
    }

    public static void name() {
        System.out.println("Hello world..");
        System.out.println(StringUtils.capitalize("hello world"));
    }

}