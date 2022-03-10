package java_chapter.chapter7.array;

import java_chapter.chapter6.cooperation.Subway;

public class ArrayTest {
    public static void main(String[] args){

        int[] arr1 = new int[]{2,4,6}; //이게 주류
        System.out.println(arr1.length);

        int[] arr2 = new int[3];  //그냥 초기화했을때 int 초기값은 0, double은 0.0,객체는 null
        arr2[0] =1;
        arr2[1] =2;
        arr2[2] =3;

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        int[] arr3 = {4,2,6};
    }
}
