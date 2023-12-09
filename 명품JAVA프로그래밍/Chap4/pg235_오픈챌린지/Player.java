package pg235_오픈챌린지;

import java.util.Scanner;

public class Player {
	private Scanner scanner;
	private String sName;
	private String cLastWord;
	private String cFirstWord; //끝말잇기의 첫단어 
	private int iLastIdx;
	private int iResult;
	private String sNextInputWord;
	
	public Player(String sName) {
		this.sName= sName;
		scanner = new Scanner(System.in);
	}
	
	public void getName() {
		System.out.print(this.sName+">>");
		return;
	}
	
	public String getWordFromUser() {
		System.out.print(this.sName+">>");
		this.sNextInputWord=scanner.nextLine(); //입력받기 
		this.cFirstWord=sNextInputWord.charAt(0);
		return this.cFirstWord;
	}
	
	public int checkSuccess(String sPreWord, String sNextInputWord) {
		this.iLastIdx=sPreWord.length()-1;
		this.cLastWord=sPreWord.charAt(iLastIdx); //이전 단어의 마지막 단어 추출 
		
		if (this.cLastWord==this.cFirstWord) {
			this.iResult=1; //둘이 같다.
		}else {
			this.iResult=0; //둘이 다르다.
		}
		return this.iResult;
	}
	
}
