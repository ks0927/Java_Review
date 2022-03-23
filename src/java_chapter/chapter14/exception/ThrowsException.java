package java_chapter.chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className); // 클래스 동적 로딩
        return c;
    }

    public static void main(String[] args) {
        ThrowsException ex = new ThrowsException();
        try {
            ex.loadClass("b.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println("응애");
        } catch (Exception e) { //Exception같이 좀 넓은건 마지막에 써야 함
            System.out.println(e);
        }
    }
}