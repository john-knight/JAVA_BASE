package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static java.lang.Class.*;

public class Reflection {
    static void hello(){System.out.print("hello");}
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {
        /* 第一种class.forname方法获取类 */
        Method method= forName("Main").getMethod("hello");
        /*第二种使用.class方法获取类*/
        Field hello = Reflection.class.getField("hello");
        /*第三种使用.getclass方法获取类*/
        Reflection reflection = new Reflection();
        reflection.getClass();


    }
}

