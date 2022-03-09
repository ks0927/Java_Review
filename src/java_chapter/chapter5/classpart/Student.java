package java_chapter.chapter5.classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName+","+ address);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
/*	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName= "�̼���";
		studentLee.address= "����� ���ʱ� ���ʵ�";
		
		studentLee.showStudentInfor();
		
	}*/
}
