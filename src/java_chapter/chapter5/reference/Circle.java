package java_chapter.chapter5.reference;

public class Circle {
	
	Point point;
	int radius;
	
	public Circle() {
		point = new Point();
	}
	public void PrintCircle() {
		System.out.println("반지름: "+radius);
		System.out.println("x: "+point.x+" y: "+point.y);
	}
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		circle.point.x=2;
		circle.point.y=3;
		circle.radius= 5;
		
		circle.PrintCircle();
	}
}
