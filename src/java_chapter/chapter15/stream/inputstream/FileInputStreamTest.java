package java_chapter.chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) {
        FileInputStream fis = null;
        int i =0;
        try {
            fis =new FileInputStream("input.txt"); //한글은 깨지는듯? 그래서FileReader쓰나봄
            while((i= fis.read()) !=-1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e); //지정된 파일을 찾을수없습니다.
        }finally {
            try {
                fis.close(); //NullPointerException
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
        System.out.println("end");

    }

}
