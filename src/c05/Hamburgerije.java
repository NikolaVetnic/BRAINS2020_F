package c05;

import java.util.Random;
import java.util.Scanner;

public class Hamburgerije {

	
	static final int BR_HAM = 10;
	
	
	static String[] dani = { "pon", "uto", "sre", "cet", "pet", "sub", "ned" };
	
	
	static void stampaj(double[][] table) {
		
		System.out.printf("%8s", "");
		
		for (int i = 0; i < dani.length; i++)
			System.out.printf("%8s", dani[i]);
		
		System.out.println();
		
		for (int i = 0; i < table.length; i++) {
			
			System.out.printf("[HAM_0%d]", i);
			
			for (int j = 0; j < table[0].length; j++) {
				System.out.printf("%8.2f", table[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		
		Random rng = new Random();
		
		
		Scanner in = new Scanner(System.in);
		
		
		double[][] table = new double[BR_HAM][dani.length];
		
		
		double[] sumRow = new double[BR_HAM];
		int[] minCol = new int[BR_HAM];
		
		
		for (int i = 0; i < table.length; i++) {
			
			double min = Double.POSITIVE_INFINITY;
			
			for (int j = 0; j < table[0].length; j++) {
				table[i][j] = 1.0 * rng.nextInt(100000) / 100;
				sumRow[i] += table[i][j];
				
				if (min >= table[i][j]) {
					minCol[i] = j;
					min = table[i][j];
				}
			}
		}
		
		
		stampaj(table);
		
		
		System.out.println("PREGLED UKUPNE ZARADE");
		for (int i = 0; i < BR_HAM; i++)
			System.out.printf("Hamburgerija #%2d : %.2f (najmanja zarada : %s) \n", i, sumRow[i], dani[minCol[i]]);
	}
}
