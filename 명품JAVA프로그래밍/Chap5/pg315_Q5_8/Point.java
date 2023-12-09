package pg315_Q5_8;

public class Point {
	private int iX,iY;
	
	public Point() {
		this.setiX(0);
		this.iY=0;
	}
	
	public Point(int x, int y) {
		this();
		this.setiX(x);
		this.iY=y;
	}
	
	public int getX() {
		return getiX();
	}
	
	public int getY() {
		return iY;
	}
	
	protected void move (int movedX, int movedY) {
		this.setiX(-movedX);
		this.iY=-movedY;
	}

	public int getiX() {
		return iX;
	}

	public void setiX(int iX) {
		this.iX = iX;
	}
}
