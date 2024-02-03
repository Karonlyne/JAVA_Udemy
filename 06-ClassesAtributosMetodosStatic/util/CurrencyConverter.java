package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double dolarValue;
	public static double dolar;
	
	public static double reais(double dolar, double dolarValue) {
		return (dolar * dolarValue) + (IOF * dolar * dolarValue);
	}
	
}
