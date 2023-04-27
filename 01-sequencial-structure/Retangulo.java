import java.util.Locale;
import java.util.Scanner;
public class Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Double b, h, a, p, d;
			b = sc.nextDouble();
			h = sc.nextDouble();
			a = b * h;
			p = 2 * b + 2 * h;
			d = Math.sqrt(Math.pow(b,2) + Math.pow(h,2));
			
			System.out.printf("Base do retangulo: %.1f%n", b);
			System.out.printf("Altura do retangulo: %.1f%n", h);
			System.out.printf("AREA = %.4f%n", a);
			System.out.printf("PERIMETRO = %.4f%n", p);
			System.out.printf("DIAGONAL = %.4f%n", d);
			
			sc.close();
		
	}

}
