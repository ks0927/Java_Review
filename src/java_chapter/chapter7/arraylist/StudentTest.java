package java_chapter.chapter7.arraylist;

public class StudentTest {
    public static void main(String[] args){

        Student studentlee  = new Student(1001,"lee");
        studentlee.addSubject("국어",100);
        studentlee.addSubject("수학",90);

        studentlee.showStudentInfo();

        Student studentkim  = new Student(1002,"kim");
        studentkim.addSubject("국어",80);
        studentkim.addSubject("수학",70);
        studentkim.addSubject("영어",40);

        studentkim.showStudentInfo();
    }
}
