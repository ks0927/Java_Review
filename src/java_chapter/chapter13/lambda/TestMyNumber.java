package java_chapter.chapter13.lambda;

public class TestMyNumber {

    public static void main(String[] args) {
        MyNumber maxNum = (x,y)->(x>=y)? x: y;  //아래 익명클래스가 내부적으로 이루어지고있음
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println(max);

        MyNumber aaa = new MyNumber() {

            @Override
            public int getMaxNumber(int num1, int num2) {//익명 클래스

                return 0;
            }
        };

    }

}
