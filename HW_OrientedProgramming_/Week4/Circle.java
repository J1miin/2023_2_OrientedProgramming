
public class Circle {
	int radius;
	
	void set(int r) {
		radius=r;
	}
	double getArea() {
		double area;
		area=3.14*radius*radius;
		return area;
	}

	public static void main(String[] args) {
		Circle myCircle = new Circle();
		myCircle.set(3);
		double result;
		result = myCircle.getArea();
		System.out.println(result);

	}

}
