package pg243_실습문제7번;

import java.util.Scanner;

public class MonthSchedule {
	public MonthSchedule() {
		
	}
	private static void input(String sTodoList, Day dayArray[], int iDay) { //왜 스태틱이어야 하지?
		dayArray[iDay].setSchedule(sTodoList);//객체의 내용 추가하기	
		
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int iDay; //날짜 입력 
		int iInputNum; //번호입력 
		String sTodoList;
		
		Day dayArray[];//객체배열 선언
		dayArray = new Day[30]; //객체배열 생성 
		
		while(true) {
			System.out.println("이번달 스케줄 관리 프로그램입니다. ");
			System.out.println("할일 (입력:1, 보기:2, 끝내기:3 ");
			iInputNum=scanner.nextInt();
			
			if(iInputNum==1) {
				System.out.print("날짜(1-30)를 입력하세요: ");
				iDay=scanner.nextInt();
				iDay=iDay-1;
				dayArray[iDay]=new Day(); //객체배열의 해당 날짜 객체 생성
				
				System.out.print("할 일 입력하세요: ");
				sTodoList=scanner.next();
				input(sTodoList, dayArray,iDay);
				
			}else if (iInputNum==2) {
				System.out.print("날짜(1-3)를 입력하세요: ");
				iDay=scanner.nextInt();
				iDay=iDay-1;
				System.out.println((iDay+1)+"일의 할 일은 "+ dayArray[iDay].get()+" 입니다.");
			}else if(iInputNum==3) {
				System.out.println("quit program");
				break;
			}else {
				System.out.println("wrong input");
			}
			
		}
		
		scanner.close();
	}

}
