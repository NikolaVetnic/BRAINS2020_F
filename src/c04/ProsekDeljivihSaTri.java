package c04;

import java.util.Scanner;

public class ProsekDeljivihSaTri {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite broj brojeva: ");
		int n = in.nextInt();
		
		int count = 0, countDiv = 0;
		
		for (int i = 0; i < n; i++) {
			
			int num;
			
			do {
				System.out.print("Unesite broj: ");
				num = in.nextInt();
				
				if (num < 15 || 62 < num)
					System.out.println("Broj van opsega!");
			} while (num < 15 || 62 < num);
			
			countDiv = num % 3 == 0 ? countDiv + 1 : countDiv;
			count++;
		}
		
		System.out.println("Procenat deljivih sa 3: " + (1.0 * countDiv / count));
		
		in.close();
	}
}
