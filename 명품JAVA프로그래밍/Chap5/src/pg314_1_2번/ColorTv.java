package pg314_1_2번;

public class ColorTv extends Tv{
	private int color ;
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printColorProperty() {
		System.out.print(getSize()+"인치 " + color + "color");
	}
}
