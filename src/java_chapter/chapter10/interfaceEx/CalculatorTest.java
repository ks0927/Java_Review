package java_chapter.chapter10.interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 =10;
        int num2 = 2;
        Calc calc = new CompleteCalc();// 업케스팅 잘 활용하자!
        //Calc calc1 = new Calc(); 당연히 인스턴스화 안되고
        //Calc calc2 = new Calculator 추상클래스여서 인스턴스화 안되고

        System.out.println((calc.add(num1, num2)));
        calc.description(); //인스턴스의 메소드나옴

        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }



}
