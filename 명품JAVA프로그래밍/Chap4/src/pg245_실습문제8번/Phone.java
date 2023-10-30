package pg245_실습문제8번;

public class Phone {
	private String name;
	private String tel;
	
	public Phone() {
		//기본생성자 
	}
	
	public void setPhoneBook(String sName, String sTel) {
		this.name=sName;
		this.tel =sTel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
}
