package c03;

import java.util.Scanner;

public class Resistivity {
	
	public static final double RCu = 1.558E-8;

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji izračunava otpornost kod bakarnog provodn-
		 * ika dužine l, prečnika d. Specifična otpornost bakra iznosi:
		 * 
		 * 1,588*10^(-8) (R=RCu*4*l/(d*d*3.14))
		 */
		

		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite duzinu provodnika: ");
		double l = in.nextDouble();
		
		System.out.print("Unesite precnik provodnika: ");
		double d = in.nextDouble();
		
		double out = (RCu * 4 * l) / (d * d * Math.PI);
		
		System.out.println("Copper resistance: " + out);
		
		in.close();
	}
}
