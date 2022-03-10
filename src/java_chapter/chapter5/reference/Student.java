package java_chapter.chapter5.reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;  //이런식으로 하는게 참조자료형
	Subject math;

	public Student() { //사용하기위해서 선언만 해선 안됨 클래스 생기지않음 그래서
		korea = new Subject(); //  생성자에서 subject 인스턴스 생성!
		math = new Subject();
	}

	public Student(int id, String name) {
		studentID =id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName +"학생의 총점은 "+total+"점 입니다.");
	}
}
