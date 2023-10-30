package pg243_실습문제7번;

public class Day {
	private String work; //하루의 할 일을 나타내는 문자열
	
	public void setSchedule (String work) { //work 수정
		this.work=work;
	}
	
	public String get() { //기능이 뭐지?
		if (this.work==null) {
			return "nothing";}
		else {
			return work;
		}
	}
	
	public void show() { //출력 메서
		if (this.work==null) {
			System.out.println("nothing");}
		else {
			System.out.println(work+"입니다. ");
		}
	}
	
}
