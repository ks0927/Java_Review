package java_chapter.chapter7.arraylist;

import java.util.ArrayList;

public class Student {

    private int studentID;
    private String studentName;
    private ArrayList<Subject> subjectList; //수강과목 배열

    public Student(int studentID, String studentName) {
        this.studentID =studentID;
        this.studentName= studentName;

        subjectList = new ArrayList<Subject>();// 학생한명이 생성되면 리스트가 어쨋든하나 생성돼야하니까
    }
    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {

        int total =0 ;
        for(Subject subject: subjectList) {
            total+= subject.getScorePoint();
        }
        for(Subject subject: subjectList) {
            System.out.println("학생 "+studentName+"님의 "+subject.getName()+" 과목의 성적은"
                    + subject.getScorePoint()+"입니다.");
        }
        System.out.println("학생"+studentName+"님의 총점은"+ total+ "점 입니다.");
    }
}
