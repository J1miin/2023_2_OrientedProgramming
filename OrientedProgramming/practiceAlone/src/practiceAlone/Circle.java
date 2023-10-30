package practiceAlone;

public class Circle {
	int radius;
	String name;
	
	public Circle () {};//생성자 형성
	public double getArea() {
		double area;
		area=3.14*radius*radius;
		return area;
	}

	public static void main(String[] args) {
		Circle circle1 = new Circle(); //선언과 생성 동시에
		circle1.radius=10;
		circle1.name="hungry";
		double area;
		area=circle1.getArea();
		System.out.println(circle1.name+"'s area is "+area);
	}

}
