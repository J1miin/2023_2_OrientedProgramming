package pg309_Q3;

public class BallPen extends Pen {
	private String color;
	
	public BallPen() {
		//default Constructor
		color="none";
	}
	
	//method 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
}
