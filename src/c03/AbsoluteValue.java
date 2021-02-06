package c03;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		double a = in.nextDouble();
		
		System.out.println("Apsolutna vrednost: " + (a < 0 ? -a : a));
		
		in.close();
	}
}
