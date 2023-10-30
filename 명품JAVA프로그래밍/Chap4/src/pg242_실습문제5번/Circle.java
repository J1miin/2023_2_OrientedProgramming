package pg242_실습문제5번;

public class Circle {
	private double x,y;
	private int radius;
	public Circle (double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}//기본생성자 초기화 하기 
	
	public void show() {
		System.out.println("("+this.x+","+this.y+")"+this.radius);
	}
}
