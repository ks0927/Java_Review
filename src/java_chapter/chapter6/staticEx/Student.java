package java_chapter.chapter6.staticEx;

public class Student {
    static int serialNum = 10000;

    int studentId;
    String studentName;

    public Student(){
        serialNum++;
        this.studentId =serialNum;

    }


}
