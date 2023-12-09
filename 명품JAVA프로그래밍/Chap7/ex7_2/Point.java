package ex7_2;
//점을 표현하는 포인트 클래스 만들고, 포인트 객체를 저장하는 벡터 작성하기
public class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		//기본생성자를 이용하여 x,y 설정하기
	}
	
	public String toString() {
		String sResult = "( "+ x+ " , "+y+" )";
		return sResult;
	}
}
