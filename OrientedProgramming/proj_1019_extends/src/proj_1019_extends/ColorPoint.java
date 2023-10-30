package proj_1019_extends;

public class ColorPoint extends Point {
	private String sColor; 
	
	public ColorPoint() {
		//기본생성자 
		sColor="";
	}
	
	public ColorPoint(int x, int y, String sColor) {
		// x,y는 프라이빗인데,,, 
		// setX(x); //되더라도 쓰면 안된다!! 생성자는 객체를 생성하는 앤데, setX는 객체 생성이 끝나야만 사용되야 한다. 
		super(x,y); 
		this.sColor=sColor;
	}
	
	public void setColor(String sColor) {
		this.sColor=sColor;
	}
	public void showColorPoint() {
		//System.out.println(sColor+"("+ x + "," + y + ")");
		//xy는 수퍼클래스에 잇는디?? 그리고 x,y, private으로 잡앗는데 자식클래스가 쓰고 있네?! 뭐지!!
		//how to solve?! >> protected로 바꾼다? NOOO ! 상속받은애를 위해 부모를 고친다 ?절대  NO! 
		//>>솔루션  
		
		System.out.print(sColor);
		showPoint(); //부모클래스가 갖고 있으니!! 
		//부모클래스에 있는 함수를 내 함수인 것 처럼 사용할 수 있다.
		//여기서는 부모클래스의 프라이베이트 필드를 건드릴 수 없다. 
	}
	
	public String toString() {
		String sRet;
		sRet="2023 10 19 목요일 오버라이딩해서 toString쓴다. ";
		//오버라이딩 :리턴타입까지 동일하게 완벽하게 100퍼센트 동일한 함수를 작성하는 것
		return sRet;
	}
}
