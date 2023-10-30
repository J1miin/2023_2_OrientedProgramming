package proj_1012;

public class CircleArray {
	
	public CircleArray() {
		//기본 생성자
	};
	
	public static void main(String[] args) {
		Circle[] cArray;
		cArray = new Circle[5]; //배열 생성 
		double dArea;
		
		for (int i=0;i<cArray.length;++i) {
			int iRadius;
			iRadius = (i+5);
			cArray[i]=new Circle(iRadius); //배열 안에 넣을 객체 생성해야해서 new 써준다.
		}
		
		for (int i=0;i<cArray.length;++i) {
			dArea=cArray[i].getArea();
			System.out.print(dArea);
		}

	}

}

//기본 생성자 없으면 만들어줄 것