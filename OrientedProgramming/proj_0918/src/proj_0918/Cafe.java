//컴퓨터공학과 2학년 김지민 
package proj_0918;
import java.util.Scanner;

public class Cafe {
	
	public static void main(String[] args) {
		int selectNum;
		int iInputNum;
		int totalPrice;
		
		int[] menuCntArray = {0,0,0,0}; 
		String[] sMenu = {"에스프레소","아메리카노","라떼","아이스티"};
		int[] iPriceArray = {1500,2000,2500,3000};
		
		//가격을 변수로 짜주는 게 좋다.
		
		totalPrice=0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("메뉴를 골라주세요.");
			System.out.println("1. 에스프레소-1,500\n2.아메리카노-2,000\n3.라떼-2,500\n4.아이스티-3,000");
			iInputNum = scanner.nextInt();
			
			if (iInputNum==0) {
				break;
			}else if (iInputNum>0 && iInputNum<5){
				selectNum=iInputNum-1;
				System.out.println(sMenu[selectNum] +": " +iPriceArray[selectNum]+"원 주문 ");
				totalPrice=totalPrice+iPriceArray[selectNum];
				menuCntArray[selectNum]=menuCntArray[selectNum]+1;
			}else {
				System.out.println("없는 메뉴입니다.");
			}
			
//			switch (selectNum) {
//				case 1:
//					System.out.println("sMenu[0] "+iPriceArray[0]+"원 주문 ");
//					totalPrice=totalPrice+iPriceArray[0];
//					break;
//				case 2:
//					System.out.println("아메리카노  "+priceArray[1]+"원 주문 ");
//					totalPrice=totalPrice+priceArray[1];
//					break;
//				case 3:
//					System.out.println("라떼  "+priceArray[2]+"원 주문 ");
//					totalPrice=totalPrice+priceArray[2];
//					break;
//				case 4:
//					System.out.println("아이스티 "+priceArray[3]+"원 주문 ");
//					totalPrice=totalPrice+priceArray[3];
//					break;
//				default://까먹엇다.
//					System.out.println("메뉴에 없는 음료입니다. ");
//			}
		}
		
		for (int i=0;i<sMenu.length;++i) {
			System.out.println(sMenu[i]+"는 총 "+menuCntArray[i]+"잔 주문 ");
		}
		System.out.print("총 매출은 " + totalPrice + "원 입니다.");
		
		scanner.close();
			
	}

}


//이건 지금 한 사람이 구매하는 개수가 되는데, 만약 사람이 많아진다면,?? like 구조체 -> collection을 쓴다! 