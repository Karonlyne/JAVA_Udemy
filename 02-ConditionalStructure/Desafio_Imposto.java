import java.util.Locale;
import java.util.Scanner;
public class Desafio_Imposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Double a, am, im, b, ib, c, ic, d, e, ab, md;

		System.out.print("Renda anual com salário: ");
		a = sc.nextDouble();
		am = a/12;
		im = 0.0;

		System.out.print("Renda anual com prestação de serviço: ");
		b = sc.nextDouble();
		ib = 0.0;

		System.out.print("Renda anual com ganho de capital: ");
		c = sc.nextDouble();
		ic = 0.0;

		System.out.print("Gastos médicos: ");
		d = sc.nextDouble();

		System.out.print("Gastos educacionais: ");
		e = sc.nextDouble();
		ab = 0.0;
		md = 0.0;
		
		System.out.println();

		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");

		System.out.println();

		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.print("Imposto sobre salário: ");

		if (am < 3000){
			im = 0.0;
			System.out.println(0);
		}
		else if (am >= 3000 & am < 5000){
			im = a * 10 / 100;
			System.out.println(im);
		}
		else {
			im = a * 20 / 100;
			System.out.println(im);	
		}

		System.out.print("Imposto sobre serviços: ");

		if (b > 0){
			ib = b * 15 / 100;
			System.out.println(ib);
		}
		else {
			ib = 0.0;
			System.out.println(ib);	
		}

		System.out.print("Imposto sobre ganho de capital: ");

		if (c > 0){
			ic = c * 20 / 100;
			System.out.println(ic);
		}
		else {
			ic = 0.0;
			System.out.println(ic);	
		}

		System.out.println();

		System.out.println("DEDUÇÕES:");
		System.out.print("Máximo dedutível: ");
		md = (im + ib + ic) * 30 / 100;
		System.out.println(md);
		System.out.print("Gastos dedutíveis: ");
		System.out.println(d + e);

		System.out.println();
		 
		System.out.println("RESUMO:");
		System.out.print("Imposto bruto total: ");
		System.out.println(im + ib + ic);

		System.out.print("Abatimento: ");
		if ((d + e) <= (md)){
			ab = d + e;
			System.out.println(ab);
		}
		else {
			ab = md;
			System.out.println(ab);
		}

		System.out.print("Imposto devido: ");
		System.out.println(im + ib + ic - ab);
		
		sc.close();
	}

}
