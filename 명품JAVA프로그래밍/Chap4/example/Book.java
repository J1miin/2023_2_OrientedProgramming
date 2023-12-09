package example;

public class Book {
	private String title, author;
	public Book () {
		//기본생성자
	} 
	public void bookInfo(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//출력
	public void printAll(int idx) {
		System.out.println("제목: " + this.title);
		System.out.println("저자: " + this.author);
		
	}	
	
			
}
