package java_chapter.chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {//throws 는 미루는거임 구현부에, throw와는 다름
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("finally");
        }

        System.out.println("end");

    }
}