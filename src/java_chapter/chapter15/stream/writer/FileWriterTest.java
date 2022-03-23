package java_chapter.chapter15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("writer.txt")){
            fw.write("A");
            char[] ch = {'B','C','D'};
            fw.write(ch);
            fw.write("안녕하세요");
            fw.write(ch,1,2);
            fw.write("123");

        }catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }

}
