package pg314_1_2번;

public class RunTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTv myTV = new ColorTv(32,1024);
		myTV.printColorProperty();
		
		System.out.println();
		
		IPtv iptv = new IPtv("192.1.1.2",32,2048);
		iptv.printProperty();
	}

}
