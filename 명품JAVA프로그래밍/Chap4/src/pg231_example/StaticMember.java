package pg231_example;

import java.util.Scanner;

public class StaticMember {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double dollar, won;
		System.out.print("환율 (1달)>>");
		won=scanner.nextDouble();
		dollar = CurrencyConverter.toDollar(won);
		System.out.printf("%.2f", dollar);
		
		scanner.close();
	}

}
