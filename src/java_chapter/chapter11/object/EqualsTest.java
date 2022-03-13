package java_chapter.chapter11.object;

class Student{
    int studentID;
    String studentName;

    Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student)obj;
            if(studentID == std.studentID)
                return true;
            else
                return false;
        }
        return false;
    }
    public int hashCode() {
        return studentID;
    }

}

public class EqualsTest {

    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2);//주소값이 같은지, 즉 인스턴스가 같은지 체크함
        System.out.println(str1.equals(str2));// 1하고2의 문자열이 같은지 체크함, 논리적인 동일성체크

        Student std1 = new Student(10001, "Tomas");
        Student std2 = new Student(10001, "Tomas");

        System.out.println(std1 == std2); //두개의 메모리가 다르니까
        System.out.println(std1.equals(std2));// equals의 원형이 ==라서 같은결과 그러니 바꿔, 이름같은때 같은사람이라고 오버라이딩 하니 ok
        //String과 Integer 경우에는 equal메서드가 이미 재정의 되어있는데
        //String은 같은 문자열일때, Integer는 정수값이 같을때 true반환

        System.out.println(std1.hashCode()); //원래는10진수로 address가 표현됨
        System.out.println(std2.hashCode()); //재정의 하면 다르게 표현가능
        //equals를 재정의하면 hashcode도 재정의 하는편

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode()); //왜 두개가 같음? hashCode가 String에서 재정의 되었기 때문
        //논리적으로 같으면 같게 재정의 됨, equal을 재정의하면 hashcode도 재정의함
        //진짜로 알고싶으면 system.identityHashCode로 확인가능

    }
}