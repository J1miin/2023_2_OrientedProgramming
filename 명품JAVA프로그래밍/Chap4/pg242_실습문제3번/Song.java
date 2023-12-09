package pg242_실습문제3번;

public class Song {
	private String sTitle;
	private String sArtist;
	private int iYear;
	private String sCountry;
	
	public Song () {
		this("no info","no info",0,"no info");
		//기본생성자 
	}
	public Song(String title, String artist, int year, String country) {
		this.sTitle=title;
		this.sArtist=artist;
		this.iYear=year;
		this.sCountry=country;
	}
	
	public void show() {
		System.out.print(this.iYear+"년 "+this.sCountry+"국적의 "+this.sArtist+"가 부른 "+this.sTitle);
	}
	
	public static void main(String[] args) {
		Song songinfo1 = new Song("DancingQueen","ABBA",1978,"sweden");
		songinfo1.show();
	}

}
