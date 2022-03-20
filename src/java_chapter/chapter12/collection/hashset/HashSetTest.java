package java_chapter.chapter12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);//순서대로 안나옴
        set.add("aaa");
        System.out.println(set);//한번만나옴 중복되서, 같은놈은 안들어감
        //string에는 이게 equals와 hashcode로 정의 되어있음


    }

}
