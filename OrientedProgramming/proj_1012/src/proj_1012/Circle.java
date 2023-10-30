package proj_1012;

public class Circle {
	public int radius;
	
	public Circle() {
		this(0); //아래의 생성자는 매개변수가 있으니가 인수전달해주는 것이다. 
		//생성자 본인의 함수만 호출 가능하고, 생성자 함수의 맨 첫번째 라인에만 쓸 수 있다.
		radius = 0; //멤버변수는 초기화해준다.
		//기본 생성자 무조건 만들고 시작하		
	}
	
	public Circle(int radius) {
		
		this.radius=radius;
	}
	
	public double getArea() {
		double dArea=0.0;
		dArea=radius*radius*3.14;
		return dArea;
	}
	
}
