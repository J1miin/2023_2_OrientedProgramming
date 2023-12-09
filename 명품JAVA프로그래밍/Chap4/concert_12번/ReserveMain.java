package concert_12번;

import java.util.Scanner;

class ReserveMain {
//좌석마다 객체배열을 생성해주기 -> 클래스가 좌석마다 필요하다.
//좌석 클래스는 좌석프레임이라는 부모클래스를 상속한다. >> 좌석마다 갖고 있을 정보는 동일할 것이니, 재사용하기 위해서! sName

	public static void main(String[] args) {
		final int SEATSIZE = 10;
		int iSelectMenu, iSelectSeat;
		String sName;
		int iSeatNum; //좌석번호 
		Scanner scanner = new Scanner(System.in);
		
		//객체배열 선언
		Sseat sArray[];
		sArray=new Sseat[SEATSIZE];
		
		Aseat aArray[];
		aArray = new Aseat [SEATSIZE];
		
		Bseat bArray[];
		bArray = new Bseat [SEATSIZE];
		
		//객체배열 생성 
		for (int i =0; i<SEATSIZE;++i) {
			sArray[i]=new Sseat();
			aArray[i]=new Aseat();
			bArray[i]=new Bseat();
		}
		//////////////////
		while (true) {
			System.out.println("지민콘서트 예약을 시스템입니다.");
			System.out.print("예약:1, 조회:2, 취소: 3, 끝내기 : 4 >>");	
			iSelectMenu = scanner.nextInt();
			
			if (iSelectMenu==1) {
				System.out.print("좌석 구분 S(1), A(2), B(3)>> ");
				iSelectSeat = scanner.nextInt();
				if(iSelectSeat==1) {//S자리 선택했을 때
					System.out.print("input your name >>");
					sName=scanner.next();
					System.out.print("input your seatNum >>");
					iSeatNum=scanner.nextInt();
					//이미 있는 자리인지 예외처리 해줘야함. 
					iSeatNum-=1; //인덱스와 다르니까 
					if (iSeatNum >9 || iSeatNum<0) {
						System.out.println("좌석은 1-10까지만 존재합니다.");
					}else {
						if (sArray[iSeatNum].getName().equals("---")) {
							sArray[iSeatNum].setName(sName);
							//비어있으니까 넣어주기 			
						}else {
							System.out.println((iSeatNum+1)+" is already occupied");
						}
					}
				}else if (iSelectSeat ==2 ) {
					//A seat
					System.out.print("input your name >>");
					sName=scanner.next();
					System.out.print("input your seatNum >>");
					iSeatNum=scanner.nextInt();
					//이미 있는 자리인지 예외처리 해줘야함. 
					iSeatNum-=1; //인덱스와 다르니까 
					if (iSeatNum >9 || iSeatNum<0) {
						System.out.println("좌석은 1-10까지만 존재합니다.");
					}else {
						if (aArray[iSeatNum].getName().equals("---")) {
							aArray[iSeatNum].setName(sName);
							//비어있으니까 넣어주기 			
						}else {
							System.out.println((iSeatNum+1)+" is already occupied");
						}
					}
					
				}else if (iSelectSeat ==3 ) {
					//B seat 
					System.out.print("input your name >>");
					sName=scanner.next();
					System.out.print("input your seatNum >>");
					iSeatNum=scanner.nextInt();
					//이미 있는 자리인지 예외처리 해줘야함. 
					iSeatNum-=1; //인덱스와 다르니까 
					if (iSeatNum >9 || iSeatNum<0) {
						System.out.println("좌석은 1-10까지만 존재합니다.");
					}else {
						if (bArray[iSeatNum].getName().equals("---")) {
							bArray[iSeatNum].setName(sName);
							//비어있으니까 넣어주기 			
						}else {
							System.out.println((iSeatNum+1)+" is already occupied");
						}
					}
				}else {
					System.out.println("wrong input of seat");
				}
			}else if (iSelectMenu ==2 ) {//조회 
				//S좌석 출력 
				System.out.print("S>>");
				for (int i=0;i<SEATSIZE;++i) {
					sArray[i].printSseat(SEATSIZE);
				}
				System.out.println();
				
				//A 좌석 출력 
				System.out.print("A>>");
				for (int i=0;i<SEATSIZE;++i) {
					aArray[i].printAseat(SEATSIZE);
				}
				System.out.println();
				
				//Print Bseat
				System.out.print("B>>");
				for (int i=0;i<SEATSIZE;++i) {
					bArray[i].printBseat(SEATSIZE);
				}
				System.out.println();
				
				System.out.println("<< 조회를 완료했습니다 >>");
				System.out.println();
				
			}else if (iSelectMenu ==3 ) {//cancel reservation
				int k; 
				System.out.print("예약한 좌석을 입력해주세요 S(1), A(2), B(3)>> ");
				iSelectSeat= scanner.nextInt();
				if (iSelectSeat == 1) {
					System.out.print("S>>");
					for (int i=0;i<SEATSIZE;++i) {
						sArray[i].printSseat(SEATSIZE);
					}
					System.out.println();
					System.out.print("예약자의 이름을 입력하세요 >> ");
					sName=scanner.next();
					for (k=0;k<SEATSIZE;++k) {
						if (sArray[k].getName().equals(sName)) {
							sArray[k].setName("---");
							System.out.println("<< 취소되었습니다 >>");
							break;
						}
					}
					if (k==SEATSIZE) {
						System.out.println("예약된 정보가 없습니다.");						
					}
				}else if (iSelectSeat ==2) {
					System.out.print("A>>");
					for (int i=0;i<SEATSIZE;++i) {
						aArray[i].printAseat(SEATSIZE);
					}
					System.out.println();
					System.out.print("예약자의 이름을 입력하세요 >> ");
					sName=scanner.next();
					for (k=0;k<SEATSIZE;++k) {
						if (aArray[k].getName().equals(sName)) {
							aArray[k].setName("---");
							System.out.println("<< 취소되었습니다 >>");
							break;
						}
					}
					if (k==SEATSIZE) {
						System.out.println("예약된 정보가 없습니다.");						
					}
				}else if (iSelectSeat ==3) {
					System.out.print("B>>");
					for (int i=0;i<SEATSIZE;++i) {
						aArray[i].printAseat(SEATSIZE);
					}
					System.out.println();
					System.out.print("예약자의 이름을 입력하세요 >> ");
					sName=scanner.next();
					for (k=0;k<SEATSIZE;++k) {
						if (bArray[k].getName().equals(sName)) {
							bArray[k].setName("---");
							System.out.println("<< 취소되었습니다 >>");
							break;
						}
					}
					if (k==SEATSIZE) {
						System.out.println("예약된 정보가 없습니다.");						
					}
				}else {
					System.out.println("없는 좌석입니다. ");
				}
			}else if (iSelectMenu ==4 ){//quit
				System.out.println("quit process");
				break;
			}else {
				System.out.println("wrong input");
			}
		}	
		scanner.close();
	}

}
