package pg314_1_2번;

public class IPtv extends ColorTv {
	private String sIP;
	
	public IPtv(String sIP, int size, int color) {
		super(size,color);
		this.sIP=sIP;
	}
	
	public void printProperty() {
		System.out.print("my IPTV is "+ sIP+" with " );
		printColorProperty();
	}
}
