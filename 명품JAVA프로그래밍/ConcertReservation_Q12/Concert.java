
public class Concert {
	private String sSeatArr[]; 
	private String aSeatArr[];
	private String bSeatArr[];
	
	//METHOD
	public Concert(int SIZE) {
		//기본생성자
		sSeatArr=new String[SIZE];
		aSeatArr=new String[SIZE];
		bSeatArr=new String[SIZE];
		for (int i=0;i<SIZE;++i) { //좌석 배열초기화 
			sSeatArr[i]="--- ";
			aSeatArr[i]="--- ";
			bSeatArr[i]="--- ";
		}
	}
	
	public void reserveSeat(int selectSeat) {
		
	}
	
}
