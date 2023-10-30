package pg245_실습문제11번;

public class Mul {
	private int iInputNum1;
	private int iInputNum2;
	private int result;
	
	public Mul(){
		//기본생성
	}
	
	public void setValue(int iInputNum1, int iInputNum2) {
		this.iInputNum1=iInputNum1;
		this.iInputNum2=iInputNum2;
	}
	public int calculate() {
		result=iInputNum1*iInputNum2;
		return result;
	}
}
