package c04;

import java.util.Scanner;

public class NajmanjiUSekvenci {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("Broj brojeva u sekvenci: ");
			n = in.nextInt();
			
			if (n <= 0) System.out.println("Trazi se prirodan broj!");
		} while (n <= 0);
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			
			int num;
			do {
				System.out.print("Broj #" + (i + 1) + ": ");
				num = in.nextInt();
				
				if (num < -10 || 100 < num) System.out.println("Van opsega!");
			} while (num < -10 || 100 < num);
			
			min = num < min ? num : min;
		}
		
		System.out.println("Najmanji u sekvenci: " + min);
		
		in.close();
	}
}
