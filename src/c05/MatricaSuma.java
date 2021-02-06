package c05;

import java.util.Scanner;

public class MatricaSuma {

	static final int N_MAX = 10;
	static final int M_MAX = 20;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = -1;
		do {
			System.out.print("Broj redova: ");
			n = in.nextInt();
			
			if (n <= 0 || N_MAX < n) System.out.println("Greska!");
		} while (n <= 0 || N_MAX < n);
		
		int m = -1;
		do {
			System.out.print("Broj vrsta: ");
			m = in.nextInt();
			
			if (m <= 0 || M_MAX < m) System.out.println("Greska!");
		} while (m <= 0 || M_MAX < m);
		
		int[][] arr = new int[n][m];
		int[] sumRow = new int[n];
		
		int sumTotal = 0;
		
		for (int i = 0; i < n; i++) {
			
			sumRow[i] = 0;
			
			for (int j = 0; j < m; j++) {
				System.out.print("arr[" + i + "][" + j + "] = ");
				arr[i][j] = in.nextInt();
				sumRow[i] += arr[i][j];
			}
			
			sumTotal += sumRow[i];
		}
		
		for (int i = 0; i < n; i++)
			System.out.println("Vrsta / suma vrednosti vrste: " + i + ", " + sumRow[i]);
		
		System.out.println("Srednja vrednost elemenata matrice : " + (1.0 * sumTotal / (n * m)));
		
		in.close();
	}
}
