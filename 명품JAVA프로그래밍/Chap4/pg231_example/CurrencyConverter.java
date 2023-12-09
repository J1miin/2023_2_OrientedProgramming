package pg231_example;

public class CurrencyConverter {
	private static double rate=1300;
	
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toWon(double dollar) {
		return dollar*rate;
	}
}
