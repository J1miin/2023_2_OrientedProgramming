package pg245_실습문제8번;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		int ipeopleNum;
		String sName;
		String sTel;
		System.out.print("인원수 >> ");
		Scanner scanner = new Scanner (System.in);
		
		ipeopleNum = scanner.nextInt();
		
		Phone phoneBook[] ;
		phoneBook = new Phone[ipeopleNum];
		
		for (int i=0;i<phoneBook.length;++i) {
			System.out.print("name and tel num >> ");
			sName=scanner.next();
			sTel=scanner.next();
			phoneBook[i]=new Phone(); //객체 생성
			phoneBook[i].setPhoneBook(sName, sTel);
		}
		System.out.println("저장되었습니다.");
		
		while(true) {
			System.out.print("검색할 이름 >> ");
			String sSearchName;
			int i;
			sSearchName = scanner.next();
			if (sSearchName.equals("q")){
				break;
			}
			for (i=0;i<phoneBook.length;++i) {
				sName=phoneBook[i].getName();
				if (sName.equals(sSearchName)) {
					sTel = phoneBook[i].getTel();
					sName = phoneBook[i].getName();
					System.out.println(sName+"의 전화번호는 "+sTel+" 입니다.");
					break;
				}
			}
			if (i==phoneBook.length) {
				System.out.println("there is no "+sSearchName);
			}
			
		}
		
		
		
		scanner.close();

	}

}
