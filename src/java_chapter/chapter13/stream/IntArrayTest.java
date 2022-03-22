package java_chapter.chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,};

        IntStream intStream = Arrays.stream(arr);
        int sum = intStream.sum();

        System.out.println(sum);

        int count = (int) Arrays.stream(arr).count();
        System.out.println(count);
    }
}
