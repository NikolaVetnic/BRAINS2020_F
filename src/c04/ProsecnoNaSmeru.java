package c04;

import java.util.Scanner;

public class ProsecnoNaSmeru {

	public static final int MIN_STUDENATA = 0;
	public static final int MAX_STUDENATA = 160;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = 0, 
			sum = 0, 
			count = 0;
		
		do {
			System.out.print("Unesite broj studenata na smeru #" + (count + 1) + ": ");
			n = in.nextInt();
			
			if (n > 0) {
				sum += n;
				count++;
			}
		} while (n != 0);
		
		System.out.println("Prosecan broj po smeru: " + (1.0 * sum / count));
		
		in.close();
	}
}
