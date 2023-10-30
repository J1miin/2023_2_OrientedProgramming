package proj_0918;

public class Gugudan {

	public static void main(String[] args) {
		int firstNum, secondNum;
		int result;
		for (int j=0;j<9;++j) {
			firstNum=j+1;
			for (int i=0;i<9;++i) { 
				secondNum=i+1;
				result = firstNum * secondNum ;
				System.out.print(firstNum + "*"+ secondNum +"=" +result + " ");
			}
			System.out.println();
		}
		
	}

}
