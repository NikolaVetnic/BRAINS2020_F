package c04;

import java.util.Scanner;

public class Faktorijel {
	
	public static int fakt(int n) {
		if (n == 1)
			return 1;
		else
			return n * fakt(n - 1);
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("Unesite broj: ");
			n = in.nextInt();
		} while (n < 0);
		
		System.out.println("Faktorijel: " + fakt(n));
		
		in.close();
	}
}
