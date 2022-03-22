package java_chapter.chapter13.lambda;

@FunctionalInterface//함수형 인터페이스 라는 의미, 여러개의 메소드를 선언하면 에러남
public interface MyNumber {

    int getMaxNumber(int num1, int num2);
    //하나만 선언
}