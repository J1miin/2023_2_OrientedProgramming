package example;

import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amountOfBook ;
		String sTitle, sAuthor;
		
		System.out.print("amount of book >> ");
		amountOfBook=scanner.nextInt();
		Book bookArray[]; //객체배열 선언
		bookArray = new Book[amountOfBook]; //객체배열 생성 
		
		scanner.nextLine();  //숫자 입 후 친 엔터로 생긴 공란없애기
		
		for(int i=0;i<amountOfBook;++i) {
			bookArray[i]=new Book(); //객체 생성
			System.out.print("title >> ");
			sTitle=scanner.nextLine(); 
			
			System.out.print("author >> ");
			sAuthor=scanner.nextLine(); 
			
			bookArray[i].bookInfo(sTitle,sAuthor);
		}
		
		//print
		for (int i=0;i<bookArray.length;++i) {
			bookArray[i].printAll(i);
		}
		scanner.close();
	}

}
