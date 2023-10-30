package pg309_Q3;

public class RunPen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FountainPen fpen = new FountainPen();
		System.out.println(fpen.getAmount());
		
		fpen.setAmount(5);
		System.out.println(fpen.getAmount());

		fpen.refill(7);;
		System.out.println(fpen.getAmount() + fpen.getColor());
	}

}
