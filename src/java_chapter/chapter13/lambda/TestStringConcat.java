package java_chapter.chapter13.lambda;

public class TestStringConcat {

    public static void main(String[] args) {
        StringConcatImpl sImpl = new StringConcatImpl(); //1. 인터페이스 구현방식
        sImpl.makeString("hello", "java");

        StringConcat concat =(s1,s2) ->System.out.println(s1 + " "+s2);//2.람다식구현방식
        concat.makeString("Hello", "java");

        StringConcat concat2 = new StringConcat() {// concat하고 사실 같은거임 내부적으로 이렇게 되는거래
            @Override
            public void makeString(String s1, String s2) {//3.익명내부 클래스 방식

                System.out.println(s1+ " "+s2);
            }
        };
        concat2.makeString("Hello", "java");
    }

}
