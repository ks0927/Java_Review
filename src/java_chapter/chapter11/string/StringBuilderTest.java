package java_chapter.chapter11.string;

public class StringBuilderTest {
    public static void main(String[] args) {

        String str1 = new String("java");
        System.out.println(System.identityHashCode(str1));

        StringBuilder buffer = new StringBuilder(str1);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(" and");      //concat과는 좀 다름
        buffer.append(" andriod");
        System.out.println(System.identityHashCode(buffer));//아까하고는 다르게 더해져도 같은 해쉬값이찍히고, garbage가 생성될일없음

        String str2 = buffer.toString();

        System.out.println(str2);
        //여기서 wrapper 클래스는 생략하는데 wrapper는 기본클래스를 감쌌다 라는듯
        //Integer와 int 더할때 언박싱 오토박싱 이야기함

    }
}
