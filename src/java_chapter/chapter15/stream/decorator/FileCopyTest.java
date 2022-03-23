package java_chapter.chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

    public static void main(String[] args) {

        long m= 0;
        int len= 0;

        try(FileInputStream fis = new FileInputStream("a.exe");
            FileOutputStream fos=new FileOutputStream("b.exe")){
            m = System.currentTimeMillis();
            int i;
            while((i= fis.read())!= -1) {
                fos.write(i);
                len++;
            }
            m = System.currentTimeMillis()-m;
        }catch(IOException e) {
            System.out.println(e);
        }
        System.out.println(len);
        System.out.println(m);
    }

}