package pg315_Q3_4;

public class Won2Dallr extends Converter {
	private double currency;
	public Won2Dallr(double inputWon) {
		this.currency = inputWon;
	}
	@Override
	protected double convert(double src) {
		double dRes;
		dRes = src/currency;
		return dRes;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "유로";
	}

	public static void main(String[] args) {
		Won2Dallr toDollar = new Won2Dallr(1500);
		toDollar.run();

	}

}
