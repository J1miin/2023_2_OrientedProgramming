
public class Rectangle {
	int width, height;
	void setWidth(int w) {
		width = w;
	}
	void setHeight(int h) {
		height = h;
	}
	public int getArea() {
		int result;
		result=width * height;
		return result;
	}

	public static void main(String[] args) {
		Rectangle newRectangle = new Rectangle();
		newRectangle.setHeight(8);
		newRectangle.setWidth(5);
		int result = newRectangle.getArea();
		System.out.println(result);

	}

}
