package c03;

import java.util.Scanner;

public class Pressure {
	
	public static final double R = 8.314472;

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji određuje pritisak jednog mola (količina g-
		 * asa - n) idealnog gasa p na osnovu zapremine gasa V i temperatu-
		 * re T. Pritisak idealnog gasa se određuje prema sledećoj formuli:
		 * p=n*R*T/V, gde je R - univerzalna gasna konstanta i iznosi: 
		 * 8.314472 J/(mol·K)
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite zapreminu: ");
		double V = in.nextDouble();
		
		System.out.print("Unesite temperaturu (K): ");
		double T = in.nextDouble();
		
		System.out.print("Unesite kolicinu gasa (mol): ");
		double n = in.nextDouble();
		
		double p = n * R * T / V;
		
		System.out.println("Pressure: " + p);
		
		in.close();
	}
}
