package java_chapter.chapter15.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for(int i = 0; i< bs.length; i++) {
            bs[i] = data++;
        }
        try(FileOutputStream fos = new FileOutputStream("output.txt",true)){//true쓰면 이어서씀
            fos.write(bs); //write(bs, 2,10) 이런식으로 c부터 10개 가능

        }catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }

}