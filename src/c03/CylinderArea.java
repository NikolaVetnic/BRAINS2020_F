package c03;

import java.util.Scanner;

public class CylinderArea {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji izračunava površinu valjka sa poluprečnik-
		 * om r i visinom H (A=2*r*(r+H)*PI)
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite precnik: ");
		double r = in.nextDouble();
		
		System.out.print("Unesite visinu: ");
		double H = in.nextDouble();
		
		double A = 2 * r * (r + H) * Math.PI;
		
		System.out.println("Cylinder area: " + A);
		
		in.close();
	}
}
