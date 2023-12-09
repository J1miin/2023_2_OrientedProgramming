import java.util.Scanner;

public class Triangle {
	int height, width;
	
	public Triangle() { //기본생성자 
	}
	
	public void setWidth(int width) { //가로 길이를 설정하는 메소드
		this.width=width; //멤버변수와 매개변수의 이름이 동일하여 this 키워드를 사용했다.
	}
	
	public void setHeight(int height) { //세로 길이를 설정하는 메소
		this.height=height;
	}
	
	public int getArea() { //넓이 구하는 메소드 
		int area;
		area=this.height*this.width*(1/2);
		return area;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tri1_Area, tri2_Area; //메소드를 통해 구한 넓이를 저장하는 변
		
		Triangle tri1 = new Triangle(); //tri1 객체 생성 
		Triangle tri2 = new Triangle(); //tri2 객체 생성 
		
		System.out.print("삼각형1 밑변: "); //사용자에게 밑변의 값을 입력받기 
		tri1.setWidth(scanner.nextInt()); //입력받은 값을 setWidth 메소드의 인자로 전달하기
		System.out.print("삼각형1 높이: "); //사용자에게 높이의 값을 입력받기 
		tri1.setHeight(scanner.nextInt()); //입력받은 값을 setHeight 메소드의 인자로 전달하기
		//삼각형2
		System.out.print("삼각형2 밑변: "); //사용자에게 밑변의 값을 입력받기 
		tri2.setWidth(scanner.nextInt()); //입력받은 값을 setWidth 메소드의 인자로 전달하기
		System.out.print("삼각형2 높이: "); //사용자에게 높이의 값을 입력받기 
		tri2.setHeight(scanner.nextInt()); //입력받은 값을 setHeight 메소드의 인자로 전달하기
		
		//넓이 비교 
		tri1_Area=tri1.getArea(); //getArea()메소드를 이용하여 넓이 구하
		tri2_Area=tri2.getArea();
		
		if(tri1_Area>tri2_Area) { //조건문을 통해 넓이 비교하기
			System.out.println("삼각형1이 더 넓습니다.");
		}else {
			System.out.println("삼각형2가 더 넓습니다.");
		}
		scanner.close();	
	}
}
