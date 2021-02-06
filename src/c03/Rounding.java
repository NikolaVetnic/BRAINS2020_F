package c03;

import java.util.Scanner;

public class Rounding {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		double a = in.nextDouble();
		
		System.out.println("Zaokruzeno: " + (int) (a > 0 ? a + 0.5 : -(-a + 0.5)) * 1.0);
		
		in.close();
	}
}
