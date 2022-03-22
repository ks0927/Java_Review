package java_chapter.chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args){

        List<String> stringList = new ArrayList<String>();
        stringList.add("Tomas");
        stringList.add("James");
        stringList.add("Edward");

        Stream<String> stream = stringList.stream();
        stream.forEach(s-> System.out.println(s)); //foreach 하나씩 돌기 최종연산자

        stringList.stream().sorted().forEach(s-> System.out.println(s)); //정렬됨

/*        for( String s: stringList){   이렇게 해도 되긴하지
            System.out.println(s);
        }*/

    }
}
