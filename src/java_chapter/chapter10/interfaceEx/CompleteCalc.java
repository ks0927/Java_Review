package java_chapter.chapter10.interfaceEx;

public class CompleteCalc extends Calculator{
    //여러개 상속받지는 않음. implements는 타입상속이라 ㄱㅊ은가봄
    //구현상속
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2!= 0) {
            return num1/num2;
        }
        return ERROR;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현했습니다.");
    }

    @Override
    public void description() {

        System.out.println("완벽한 계산기");
    }

}
