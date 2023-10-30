
public class Gugudan_2 {

	public static void main(String[] args) {
		int firstNum, secondNum;
		int result;
		int k;
		for (k=0;k<3;++k) {
			for (int j=0;j<9;++j) {
				secondNum=j+1;
				for (int i=0;i<3;++i) {
					firstNum=(3*k)+(i+1);
					result=firstNum * secondNum; 
					if (result <10) {
						System.out.print(firstNum + "*"+ secondNum +"= " +result + "    ");
					}else {
						System.out.print(firstNum + "*"+ secondNum +"=" +result + "    ");
					}	
				}
				System.out.println();
			}
			System.out.println("==========================");
		}
	}

}
/* 012 로 147을 만들기 
 0 -> 1 : 3*0+1
 1 -> 4 : 3*1+1
 2 -> 7 : 3*2+1
 */