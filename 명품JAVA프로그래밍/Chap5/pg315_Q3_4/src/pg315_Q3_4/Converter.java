package pg315_Q3_4;

import java.util.Scanner;

public abstract class Converter {
	//추상메서드
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	
	//일반적인 필드와 메서드
	protected double ratio; // 필드 선언 가능 -> 추상클래스이므로
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+ getDestString()+"으로 바꿉니다. ");
		System.out.print(getSrcString()+"을 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("반환 결과 : "+ res + getDestString());
		scanner.close();
	}
}
