package java_chapter.chapter11.string;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("abc"); //final이라 선언된"abc"문자열이 안바뀜
        String str2 = new String("abc");

        System.out.println(str1 ==str2);// 서로 다른 주소

        String str3 = "abc";
        String str4 = "abc";//문자열 상수
        System.out.println(str3 ==str4);// 문자열메모리, 서로 동일한 메모리를 가르킴

        System.out.println(System.identityHashCode(str1));
        str1= str1.concat(str2);//concat()=>붙히는거, str1에 str2가 붙은거임? ㄴㄴ합체된 문자열이 생성되고 그걸 가르키게된거임
        System.out.println(System.identityHashCode(str1));//보면 값이 다름
        System.out.println(str1);
    }
}
