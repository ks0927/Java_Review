package java_chapter.chapter10.interfaceEx;

public interface Calc {
                        //인터페이스에서는 상수와 추상메서드만 들어감
    double PI = 3.14; // public static final이 들어가짐
    int ERROR = -999999999;

    int add(int num1,int num2); //public abstract가 들어가짐
    int subtract(int num1,int num2);
    int times(int num1,int num2);
    int divide(int num1,int num2);

    default void description() {
        System.out.println("정수 계산기");
    }
    static int total(int[] arr) {
        int total =0;

        for(int i : arr) {
            total+=i;
        }
        return total;
    }
}
