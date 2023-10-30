package pg235_오픈챌린지;

import java.util.Scanner;

public class WordGameApp {
	private Scanner scanner;
	private String startWord = "아버지";
	private Player oPlayerArr[]; //게임참가자들 
	private static String sName;
	private static int iPlayerNum;
	private static char newWord;
	public WordGameApp() {
		//default constructor
		scanner = new Scanner(System.in);
	}
	
	private void createPlayers() {	
		
		System.out.println("how many player join this game? >> ");
		iPlayerNum = scanner.nextInt();
		oPlayerArr = new Player[iPlayerNum]; //게임참가자 수 만큼 객체배열을 만든다.

		for (int i=0; i<oPlayerArr.length;++i) {
			System.out.print("input Name >> ");
			sName=scanner.nextLine();
			oPlayerArr[i]=new Player(sName);//객체 생성
		}
	}
	
	public void run() {
		int iCnt =0;
		System.out.println("start the game..");
		createPlayers();
		String lastWord = startWord;
		
		System.out.println("start word is "+lastWord);
		
		while (true ) {
			iCnt=iPlayerNum%iCnt;
			newWord = oPlayerArr[iCnt].getWordFromUser();
			if (oPlayerArr[iCnt].checkSuccess(startWord, newWord)) {
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		

	}

}
