package java_chapter.chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {

        try(InputStreamReader irs =new InputStreamReader(new FileInputStream("reader.txt"))){
            //바이트 단위로 밖에 못 읽는데 문자도 지원하게 해주려면 inputstreamreader로 감싸주면 된다.
            int i= 0;
            while((i= irs.read())!=-1){
                System.out.print((char)i);
            }
        }catch(IOException e) {
            System.out.println(e);
        }
    }

}

