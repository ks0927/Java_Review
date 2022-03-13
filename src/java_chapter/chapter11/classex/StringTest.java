package java_chapter.chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //reflection 프로그램인데 다 잊어도 되는데 Class.forName은 좀 알아갔으면
        Class strClass = Class.forName("java.lang.String");
        Constructor[] cons =strClass.getConstructors();

        for(Constructor c: cons) {
            System.out.println(c);
        }

        Field[] fields = strClass.getFields();
        for(Field f: fields) {
            System.out.println(f);
        }
        Method[] methods = strClass.getMethods();
        for(Method m: methods) {
            System.out.println(m);
        }
    }
}
