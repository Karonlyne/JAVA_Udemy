package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notafinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String passoufalhou() {
		if (notafinal() >= 60) {
			return "NOTA FINAL = "
					+ String.format("%.2f%n", notafinal())
					+ "PASS ";
		} else {
			return "NOTA FINAL = "
					+ String.format("%.2f%nFAILED%n", notafinal())
					+ "FALTARAM "
					+ String.format("%.2f", 60-notafinal())
					+ " PONTOS ";
		}
		
		
	}
	
	
}

//package entities;
//
//public class Student {
//	public String name;
//	public double grade1;
//	public double grade2;
//	public double grade3;
//	public double result;
//	public double pointsMissing;
//	
//	public double finalGrade() {
//		result = grade1 + grade2 + grade3;
//		return result;
//	}
//	
//	public String result() {
//		if (result >= 60) {
//			return "PASS";
//		} else {
//			pointsMissing = 60 - result;
//			return "FAILED%n"
//				+ "FALTARAM "
//				+ pointsMissing
//				+ " PONTOS";
//		}
//	}
//	
//	public String toString() {
//		return "NOTA FINAL = "
//			+ String.format("%.2f%n", finalGrade())
//			+ result();
//	}
//}
