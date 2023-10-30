package proj_0907;
import java.util.Scanner; //1.1
import java.lang.String; //lang 파일은 import 안해도 된다. 

public class CmyFirstClass {

	public static void main(String[] args) {
		Scanner oScann; //0. 선언 	
		String sName; //3.1 String은 너무 일반화 된 데이터 타입이라 이렇게 썼다고  
		int iNo;
		
		oScann = new Scanner(System.in);//1. in으로 열리게 되는 것임.
		//new = 동적 할당 받는 부분. 
		//Scanner는 스캐너 클래스의 생성자 이름임. 생성자와 클래스 이름은 같다.
		System.out.print("input your Name:");//3
		sName = oScann.next(); //4.next메서드가 인풋된거 하나를 나한테 넘겨주는 것임.
		System.out.println("your name is "+ sName);//5.
		
		//int
		System.out.print("input your Age:");
		iNo = oScann.nextInt(); //int 타입 인풋 받는 방법
		System.out.println("your age is " + iNo);
		
		//두개입력 : 입력시 띄어쓰
		System.out.print("input your Name and age");
		sName = oScann.next();
		iNo = oScann.nextInt();
		System.out.print("input your Name: " + sName);
		System.out.print("input your Age:" + iNo);
		
		oScann.close(); //2. scanner와 같이 시스템자원을 쓰는 애들은 무조건 사용후에 close해줘야 한다.
		
		
		
	}

}
