import java.util.Scanner;

public class ConcertMain {

	public static void main(String[] args) {
		final int SEATSIZE = 10;
		int iSelectMenu, iSelectSeat;
		String sName;
		int iSeatNum; //좌석번호 
		Scanner scanner = new Scanner(System.in);
		
		Concert concert = new Concert(SEATSIZE); //콘서트객체 생성
		
		while (true) {
			System.out.println("지민콘서트 예약을 시스템입니다.");
			System.out.print("예약:1, 조회:2, 취소: 3, 끝내기 : 4 >>");	
			iSelectMenu = scanner.nextInt();
			if (iSelectMenu ==1) {
				System.out.print("좌석 구분 S(1), A(2), B(3)>> ");
				iSelectSeat = scanner.nextInt();
				concert.reserveSeat(iSelectSeat);
			}
			break;
		}
		scanner.close();
	}

}
