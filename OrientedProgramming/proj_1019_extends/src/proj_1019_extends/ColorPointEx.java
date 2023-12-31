package proj_1019_extends;

public class ColorPointEx {

	public static void main(String[] args) {
		Point oPoint;
		oPoint = new Point(); // 객체생성 //포인트 클래스의 기본생성자로생성하라고 했기 때문에 생성이 되는 것임. 
		oPoint.set(1,2); //리턴타입 안받고 있음 >> void로 설정 
		oPoint.showPoint();
		
		ColorPoint oColorPoint ; //레퍼런스 변수 선언
		
		//객체 생성
		oColorPoint = new ColorPoint(3,4,"RED"); //기본생성자를 자기가 알아서 호출하므로 에러 없이 잘 생성함.
		oColorPoint.set(3, 4); // 에러가 안난다. >> 상속받아서 Point에 있는 메서드를 그대로 쓸 수 있기 때문이다. 
		
		oColorPoint.setColor("RED");
		oColorPoint.showColorPoint();
		
		String sObMsg = oColorPoint.toString(); //toString은 클래스를 설명한다. 
		System.out.println(sObMsg);
		//toString은 오브젝트 클래스에 있는 것이다. 
	}

}