
public class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name=name;
		this.price=price;
		this.numberOfStock=numberOfStock;
		this.sold=sold;
	}
	
	public static void main(String[] args) {
		Goods camera = new Goods("Sony",40000,4,30);
		System.out.println("상품 이름: "+ camera.name);
		System.out.println("상품 가격: "+ camera.price);
		System.out.println("재고 수량: "+ camera.numberOfStock);
		System.out.println("팔린 수량: "+ camera.sold);
	}

}
