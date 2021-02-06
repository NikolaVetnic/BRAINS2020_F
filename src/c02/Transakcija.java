package c02;

public class Transakcija {

	public static void main(String[] args) {
		
		double kurs = 123.5;
		double iznos = 155000;
		
		System.out.printf("%.2f RSD = %.2f EUR", iznos, (iznos / kurs));
	}
}
