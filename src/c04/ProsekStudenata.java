package c04;

import java.util.Scanner;

public class ProsekStudenata {
	
	public static final int MAX_STUDENATA = 160;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double sum = .0;
		int count;
		
		for (count = 0; count < MAX_STUDENATA; count++) {
			System.out.print("Unesite prosek studenta broj #" + (count + 1) + ": ");
			double p = in.nextDouble();
			
			sum += p;
			
			if (p == 0) {
				System.out.println("Zavrsetak unosa.");
				break;
			}
		}
		
		System.out.println("Prosek studenata: " + (sum / count));
		
		in.close();
	}
}
