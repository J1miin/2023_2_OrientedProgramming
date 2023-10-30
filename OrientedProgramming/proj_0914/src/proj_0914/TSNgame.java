package proj_0914;
//컴퓨터공학과 369 게임
import java.util.Scanner;

public class TSNgame {

	public static void main(String[] args) {
		Scanner oScann;
		int iInput;
		int mod;
		int checkdigit, digit;
		
		System.out.print("정수를 입력하세요");
		oScann = new Scanner(System.in);
		iInput = oScann.nextInt(); 
		System.out.print("you input [" + iInput + "]"+ " ");
		
		//iInput=369;	
		//자릿수로 접근할 것
		if (iInput >0 && iInput<1000) {
			checkdigit = iInput/100; //input이 500이라고 생각하자 >> checkdigit will be 5 this distinguish the place of number
			if (checkdigit!=0) { //it means it has 3 place of number
				digit=3;
				for (int i=0;i<digit;++i) { //repeat 3 times because of it's number place
					mod = iInput%10; //500%10 = 0  //50%10 = 0
					if (mod==3 || mod ==6 || mod ==9) {
						System.out.print("짝 ");
					}
					iInput = iInput /10; //500/10=50 //50/10=5
				}
			}else {
				checkdigit = iInput %100; 
				checkdigit = checkdigit/10;  
				if (checkdigit !=0) {//2자리 수라면 
					digit = 2;
					for (int i=0;i<digit;++i) {
						mod = iInput%10;
						if (mod==3 || mod ==6 || mod ==9) {
							System.out.print("짝 ");
						}
						iInput = iInput /10;
					}
				}else {//1자리 수라면
					if (iInput==3 || iInput ==6 || iInput ==9) {
						System.out.print("짝 ");
					}
				}
						//처음/중간/마지막에서 치고 들어가는 방법 
			}
			
			//0보다 작고 1000보다 크면 에러! 하지 말고 이렇게 바꾸자
			/*
			mod = iInput%10;
			if (mod==3 || mod ==6 || mod ==9) {
				System.out.print("짝 ");
			}
			iInput = iInput /10;
			
			mod= iInput%10;
			if (mod==3 || mod ==6 || mod ==9) {
				System.out.print("짝 ");
			}
			iInput = iInput/10;
			
			mod=iInput%10;
			if (mod==3 || mod ==6 || mod ==9) {
				System.out.print("짝 ");
			}*/
			
		}else {
			System.out.println("범위초과 ");
		}
		
		
	/*	
		1=0+1;
		3=1+2;
		6=3+3;*/
	//  iSum=iSum+i(변하는애)
			
		
		
		
		oScann.close();
		// TODO Auto-generated method stub

	}

}
