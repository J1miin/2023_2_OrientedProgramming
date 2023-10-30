package hw2;

import java.util.Scanner;

public class Triangle {
	
	
	public Triangle() {
	}
	
	public static double getArea(double dWidth, double dHeight) {
		double dArea;
		dArea = (dWidth * dHeight)/2;
		return dArea;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double tri1_width, tri1_height, tri1_area;
		double tri2_width, tri2_height, tri2_area;
		
		System.out.print("삼각형1 밑변: ");
		tri1_width=scanner.nextDouble();

		System.out.print("삼각형1 높이: ");
		tri1_height=scanner.nextDouble();

		System.out.print("삼각형2 밑변: ");
		tri2_width=scanner.nextDouble();

		System.out.print("삼각형2 높이: ");
		tri2_height=scanner.nextDouble();
		
		tri1_area=getArea(tri1_width, tri1_height); //첫번째 삼각형 넓이 구하기
		tri2_area=getArea(tri2_width, tri2_height); //두번째 삼각형 넓이 구하기 
		
		if (tri1_area>tri2_area) {
			System.out.println("삼각형1이 더 넓습니다.");
		}else {
			System.out.println("삼각형2 더 넓습니다.");
		}
	}

}
