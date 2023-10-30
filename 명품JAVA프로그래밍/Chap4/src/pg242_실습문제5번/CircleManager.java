package pg242_실습문제5번;

import java.util.Scanner;

public class CircleManager {

	public static void main(String[] args) {
		double x,y;
		int radius;
		
		Scanner scanner = new Scanner (System.in);
		
		
		Circle cArray[];
		cArray =new Circle[3];
		
		for (int i=0;i<cArray.length;++i) {
			System.out.println("x,y,radius를 입력해주세요 :");
			x=scanner.nextDouble();
			y=scanner.nextDouble();
			radius=scanner.nextInt();
			
			cArray[i]=new Circle(x,y,radius);
		}
		
		for (int i=0;i<cArray.length;++i) {
			cArray[i].show();
		}
		scanner.close();
	}

}
