package java_chapter.chapter10.interfaceEx;

public abstract class Calculator implements Calc{
    //인터페이스 다 구현안해서 추상클래스 되어버림
    //타입 상속

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 -num2;
    }
}
