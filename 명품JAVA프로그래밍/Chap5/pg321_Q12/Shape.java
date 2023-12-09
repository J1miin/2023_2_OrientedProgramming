package pg321_Q12;

public abstract class Shape {
	private Shape newShape;
	public Shape() {
		newShape = null; 
		//처음 도형의 레퍼런스를 저장하는 레퍼런스 변수 null로 초기화
	}
	public abstract void draw();
}
