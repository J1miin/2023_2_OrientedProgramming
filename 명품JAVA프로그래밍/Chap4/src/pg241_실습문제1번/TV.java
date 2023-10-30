package pg241_실습문제1번 ;

public class TV {
	private String company;
	private int year;
	private int inch;
	
	public TV(String company, int year, int inch) {
		this.company=company;
		this.year=year;
		this.inch=inch;
	}
	public void show() {
		System.out.print(this.company+"에서 만든 "+this.year+"년 "+this.inch+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTv = new TV("LG",2017,32);
		myTv.show();

	}

}
