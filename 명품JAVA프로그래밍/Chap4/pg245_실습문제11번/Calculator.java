package pg245_실습문제11번;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int iInputNum1, iInputNum2;
		char cOperator;
		int iResult;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("input two integer and one opertaor >>");
		iInputNum1=scanner.nextInt();
		iInputNum2=scanner.nextInt();
		cOperator=scanner.next().charAt(0);
		
		if(cOperator == '+') {
			Add add1 = new Add();
			add1.setValue(iInputNum1, iInputNum2);
			iResult=add1.calculate();
			System.out.println(iResult);
		}else if (cOperator == '-') {
			Sub sub1 = new Sub();
			sub1.setValue(iInputNum1, iInputNum2);
			iResult=sub1.calculate();
			System.out.println(iResult);
		}else if (cOperator == '*') {
			Mul mul1 = new Mul();
			mul1.setValue(iInputNum1, iInputNum2);
			iResult=mul1.calculate();
			System.out.println(iResult);
		}else if (cOperator == '/') {
			if (iInputNum2==0) {
				while (true) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요 >> ");
					iInputNum2=scanner.nextInt();
					if (iInputNum2 != 0) {
						break;
					}
				}			
			}
			Div div1 = new Div();
			div1.setValue(iInputNum1, iInputNum2);
			iResult=div1.calculate();
			System.out.println(iResult);
			
		}else {
			System.out.println("wrong operator");
		}
		
		scanner.close();

	}

}
