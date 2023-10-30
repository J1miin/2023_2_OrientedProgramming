package proj_1019_extends;

public class Point {
	private int x; //접근지정자 무조건 쓸 것 default 쓰지 말 것.
	private int y;
	//전부 private을 기본으로 생각하고 필드 변수 선언할 것 
	
	public Point() {
		//기본 생성자 무조건 생성할 것 //초기화
		this(0,0); //같은 클래스 내에서 다른 생성자 호출 할 때 쓰는 것 
//		x=0;
//		y=0;
	}
	
	public Point(int x, int y) {
		//매개변수 두 개받는 생성자 //초기화
		this.x=x;
		this.y=y;
	}
	
	//객체에서 호출하므로, 이 메서드는 무조건 Public이어야 한다.
	public void set(int x, int y) {
		this.x = x;
		this.y = y; //this = 나 자신을 레퍼런스로 하는특별한 아이 
	}
	
	//getter & setter 하는 이유 : 무슨 변수가 있는지 보여주기 싫어서 보호하는 것이다. 
	//읽어가게만 하고 싶다. = get 함수 
	public int getX() {
		return x; 
	}
	//수정하게 해주고 싶다. = set 함수 
	public void setX(int x) {
		this.x = x;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
