import java.util.Scanner;

public class Hw_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sInput = new String();
		int sToint;
		int result;
		result =0; 
		
		while(true) {
			System.out.print("숫자를 입력하세요. 종료는 (q)");
			sInput=scanner.next();
			try {
				sToint=Integer.parseInt(sInput);
				result=result + sToint+54;
				System.out.println(sInput+" + 54 = "+result);
			}catch(NumberFormatException e) {
				if (sInput.equals("q")) {
					System.out.println("Main 메소드를 종료합니다.");
					break;
				}else {
					System.out.println("q가 아닌 문자는 입력할 수 없습니다.");
					//continue
				}	
			}
		}
		System.out.println("the result is "+result);
		scanner.close();
	}

}

//사진 참고 : 버퍼에 남아있기 때문에 그걸 str로 다시 받아주면 된다. 
