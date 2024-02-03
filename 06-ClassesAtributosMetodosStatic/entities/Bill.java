package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public double couvert() {
		if (feeding() > 30) {
			return 0;
		} else {
			return 4;
		}
	}
	
	public String isento() {
		if (couvert() == 0) {
			return "Isento de Couvert";
		} else {
			return String.format("Couvert = R$ %.2f", couvert());
		}
	}
	
	public double feeding() {
		return (beer * 5) + (barbecue * 7) + (softDrink * 3);
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8;
		} else {
			return 10;
		}
	}
	
	public double total() {
		return feeding() + couvert() + ticket();
	}
	
	public String toString() {
		return "RELATÓRIO:"
			+ String.format("%nConsumo = R$ %.2f%n", feeding())
			+ isento()
			+ String.format("%nIngresso = R$ %.2f%n", ticket())
			+ String.format("%nValor a pagar = R$ %.2f%n", total());
	}
}
