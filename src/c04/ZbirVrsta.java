package c04;

import java.util.Scanner;

public class ZbirVrsta {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = -1, m = -1;
		
		do {
			System.out.print("Unesite sirinu matrice: ");
			n = in.nextInt();
		} while (n < 0);
		
		do {
			System.out.print("Unesite visinu matrice: ");
			m = in.nextInt();
		} while (m < 0);
		
		int[][] arr = new int[n][m];
		int[] sum = new int[n];
		int sumArr = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
				int num = -1;
				
				do {
					System.out.print("arr[" + i + "][" + j + "] : ");
					num = in.nextInt();
				} while (n < 0);
				
				arr[i][j] = num;
				sum[i] += num;
			}
			
			System.out.println("Suma elementa vrste #" + i + ": " + sum[i]);
			sumArr += sum[i];
		}
		
		System.out.println("Suma svih elemenata : " + sumArr);
	}
}
