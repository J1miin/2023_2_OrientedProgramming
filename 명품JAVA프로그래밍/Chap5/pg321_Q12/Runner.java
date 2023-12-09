package pg321_Q12;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Runner {
	private static Vector<Shape> saveShape = new Vector<Shape>();
	private static Iterator<Shape> it;
	
	public static void run() {
		System.out.println("Graphci Editor Beauty has started");
		Scanner scanner = new Scanner(System.in);
		int inputNum, selectShape, delIdx;
		
		while (true) {
			System.out.print("1.Insert 2.Delete 3.See All 4.End ");
			inputNum=scanner.nextInt();
			
			if (inputNum==1) {
				System.out.print("1.Line 2.Rect, 3.Circle ");
				selectShape=scanner.nextInt();
				if(selectShape==1) {
					Shape oLine = new Line();
					saveShape.add(oLine);
					
				}else if(selectShape==2) {
					Shape oRect = new Rect();
					saveShape.add(oRect);
					
				}else if(selectShape==3) {
					Shape oCircle = new Circle();
					saveShape.add(oCircle);
				}
				else {
					System.out.println("wrong input");
				}
			}else if(inputNum==2) {
				System.out.print("which index of Shape do you want to Delete:");
				delIdx=scanner.nextInt();
				if(delIdx>saveShape.size()) {
					System.out.println("out of size");
				}else {
					saveShape.remove(delIdx);
				}
			}else if(inputNum==3) {
				it = saveShape.iterator();
				while(it.hasNext()) {
					it.next().draw();
				}
			}else if(inputNum==4) {
				System.out.println("quit");
				break;
			}else {
				System.out.println("Wrong input");
			}
		}
		scanner.close();
		return;
	}
	public static void main(String[] args) {
		run();
	}

}
