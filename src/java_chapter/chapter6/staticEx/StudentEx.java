package java_chapter.chapter6.staticEx;

public class StudentEx {
    public static void main(String[] args){

        Student james = new Student();
        Student tomas = new Student();

        System.out.println(james.studentId);
        System.out.println(tomas.studentId);

        System.out.println(Student.serialNum); //static 변수니까 당연히 둘다 같을것
        System.out.println(Student.serialNum); //staitc 변수는 class 변수라고도 불림
        //그리고 static 변수들은 class이름으로 참조함
        //static변수는 여러개의 인스턴스가 같은 메모리 값을 공유하기위해 사용
        //언제 할당 받냐면 전체프로그램이 메모리에 로드 될때 그때 할당받음( 상수, 리터럴, static 이런놈들이 사용함)



    }
}
