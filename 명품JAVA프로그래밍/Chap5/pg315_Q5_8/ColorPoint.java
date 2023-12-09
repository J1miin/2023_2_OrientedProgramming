package pg315_Q5_8;

public class ColorPoint extends Point {
	private int iX,iY;
	private String sColor;
	
	public ColorPoint() {
		super();
		this.sColor="black";
	}
	
	public ColorPoint(int iX, int iY, String sColor) {
		//생성자
		super(iX,iY);
		this.sColor=sColor;
	}
	
	public void setXY(int iX, int iY) {
		this.iX=iX;
		this.iY=iY;
	}

	public void setColor(String sColor) {
		this.sColor=sColor;
	}
	
	public String toString() {
		return "color is :"+ sColor +" coordinate: ("+ iX+","+iY+")" ;
	}

}
