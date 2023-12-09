package concert_12번;

public class SeatFrame {
	private String sName;
	int seatNum ;
	
	public SeatFrame() {
		//기본생성자;	
		sName = "---";
	}
	public void setName(String sName) {
		this.sName = sName;
	}
	public String getName() {
		return sName;
	}
	public void printAll(int SEATSIZE) {
		System.out.print(this.sName+" ");
	}

}
