package c04;

import java.util.Scanner;

public class VeciBroj {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");
		int a = in.nextInt();
		
		System.out.print("Unesite drugi broj: ");
		int b = in.nextInt();
		
		if (a > b) 		System.out.println("Prvi broj je veci.");
		else if (a < b) System.out.println("Drugi broj je veci.");
		else 			System.out.println("Brojevi su jednaki.");
		
		in.close();
	}
}
