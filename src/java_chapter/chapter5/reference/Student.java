package java_chapter.chapter5.reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;  //�̷������� �ϴ°� �����ڷ�����
	Subject math;

	public Student() { //����ϱ����ؼ� ���� �ؼ� �ȵ� Ŭ���� ���������� �׷���
		korea = new Subject(); // �����ڿ��� subject �ν��Ͻ� ����!
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
		System.out.println(studentName +"�л��� ������ "+total+"�� �Դϴ�.");
	}
}
