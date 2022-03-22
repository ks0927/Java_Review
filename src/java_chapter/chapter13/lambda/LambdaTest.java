package java_chapter.chapter13.lambda;

interface PrintString{
    void showString(String str);
}
public class LambdaTest {

    public static void main(String[] args){
        PrintString lambdaPrint = str -> System.out.println(str); //변수에서 바로 하는 방법
        lambdaPrint.showString("test");

        showMyString(lambdaPrint); //매개변수로 넘어가서하는 방법

        PrintString reStr = returnPrint(); //반환값에 넘기는 방법
        reStr.showString("hello");
    }

    public static void showMyString(PrintString lambda){
        lambda.showString("test2");
    }

    public static PrintString returnPrint(){
        return s->System.out.println(s+"world");
    }

}
