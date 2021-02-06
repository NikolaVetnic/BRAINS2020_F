package c03;

import java.util.Scanner;

public class ConeVolume {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji izračunava zapreminu kupe sa poluprečnikom
		 * r i visinom H (V=1/3*r*r*H*PI)
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite precnik: ");
		double r = in.nextDouble();
		
		System.out.print("Unesite visinu: ");
		double H = in.nextDouble();
		
		System.out.println("Cone volume: " + (1.0 / 3 * r * r * H * Math.PI));
		
		in.close();
	}
}
