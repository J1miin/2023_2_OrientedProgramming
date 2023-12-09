package ex7_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class PointRunner {
	private static Vector<Point> pointVec;
	private static Scanner scanner;
	private static Point newPoint;
	private static Iterator<Point> it;
	
	private static void setVector() {
		pointVec = new Vector<Point>();  //벡터 생성
	}
	
	private static void inputXY(){
		int x,y;
		scanner=new Scanner(System.in);
		System.out.print("input x&y : ");
		x=scanner.nextInt();
		y=scanner.nextInt();
		
		newPoint = new Point(x,y);
		pointVec.add(newPoint); //벡터에 넣기 
		
	}
	
	private static void printVec() {
		it = pointVec.iterator(); //이터레이터는 객체 못 만든다!! 주의할 것!!
	
		while (it.hasNext()) {
			Point pResult = it.next();
			System.out.println(pResult.toString()); //toString 오버라이딩으로 출력해보기까지 연습 해봤다.
		}
	}
	
	private static void removeVecElement() {
		//아 벡터는 삭제하고 요소들을 자동으로 앞으로 당겨오니까 for i로 지우면 0번 2번 인덱스가 삭제되는구나. 
//		for (int i=0;i<2;++i) {
//		pointVec.remove(0);
//		pointVec.remove(0);
//		//2개만 지울거라 가정 
		//위와 같이 작성하는 것보다 iterator를 이용한 삭제가 좋을 것 같다. 
		it=pointVec.iterator();
		int iCnt =0;
		while (it.hasNext()) {
			if (iCnt==2) {
				break;
			}
			it.next();
			it.remove();
			iCnt++;			
		}
	}
	

	public static void main(String[] args) {
		setVector();
		int icount =0;
		
		while (icount<4) {
			inputXY();
			icount++;
		}
		
		printVec();
		
		removeVecElement();
		System.out.println("after delete two element of Vector");
		printVec();
		
		
		scanner.close();
	}
	

}
