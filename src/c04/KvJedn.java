package c04;

import java.util.Scanner;

public class KvJedn {
	
	enum Resenje { REALNA, IMAGINARNA, DVOSTRUKO, LINEARNA, POGRESNA };

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			double a, b, c;
			double x1 = 0, x2 = 0,
				   y1 = 0, y2 = 0;
			
			Resenje tipResenja = Resenje.POGRESNA;
			
			System.out.println("Unesite koeficijente: ");
			
			System.out.print("a -> ");
			a = in.nextDouble();
			
			System.out.print("b -> ");
			b = in.nextDouble();
			
			System.out.print("c -> ");
			c = in.nextDouble();
			
			if (a != .0) {
				
				double d = b * b - 4 * a * c;
				
				if (d > 0) {
					
					tipResenja = Resenje.REALNA;
					x1 = (- b - Math.sqrt(d)) / (2 * a);
					x2 = (- b + Math.sqrt(d)) / (2 * a);
				} else if (d == 0) {
					
					tipResenja = Resenje.DVOSTRUKO;
					x1 = - b / (2 * a);
				} else {
					
					tipResenja = Resenje.IMAGINARNA;
					x1 = - b / (2 * a);					x2 =   x1;
					y1 = - Math.sqrt(- d) / (2 * a);	y2 = - y1;
				}
			} else if (b != .0) {
				
				tipResenja = Resenje.LINEARNA;
				x1 = - c / b;
			}
			
			switch (tipResenja) {
				case REALNA: 
					System.out.printf("Realni koreni jednacine su : %.2f ∧ %.2f \n", x1, x2);
					break;
				case IMAGINARNA:
					System.out.printf("Imaginarni koreni jednacine su : %.2f ± %.2f * i \n", x1, Math.abs(y1));
					break;
				case DVOSTRUKO:
					System.out.printf("Jednacina ima dvostruki realni koren : %.2f \n", x1);
					break;
				case LINEARNA:
					System.out.printf("Jednacina je linearna sa resenjem: %.2f \n", x1);
					break;
				case POGRESNA:
					System.out.println("Greska pri unosu!");
			}
			
			System.out.print("Ponoviti? [D]a / Ne (bilo koji unos) -> ");
			String kraj = in.next();
			
			if (!("" + kraj.charAt(0)).toLowerCase().equals("d")) run = false;
		}
		
		in.close();
	}
}
