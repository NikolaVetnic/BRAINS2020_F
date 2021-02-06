package c05;

import java.util.Random;
import java.util.Scanner;

public class MaksimumMatrica {
	
	static final int DIM = 20;
	static final int RNG = 20;

	public static void main(String[] args) {
		
		
		Random rng = new Random();
		
		
		Scanner in = new Scanner(System.in);
		
		
		int n = -1;
		do {
			System.out.print("Vrsta: ");
			n = in.nextInt();
			
			if (n <= 0 || DIM < n) System.out.println("Greska!");
		} while (n <= 0 || DIM < n);
		
		
		int m = -1;
		do {
			System.out.print("Kolona: ");
			m = in.nextInt();
			
			if (m <= 0 || DIM < m) System.out.println("Greska!");
		} while (m <= 0 || DIM < m);
		
		
		int[][] arr = new int[n][m];
		
		
		int[] maxPos = { 0, 0 };
		
		
		int[] sumCol = new int[m];
		int[] sumRow = new int[n];
		
		
		int maxColSum = 0;
		int maxRowSum = 0;
		
		
		int maxColSumIdx = 0;
		int maxRowSumIdx = 0;
		
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
//				System.out.print("a[" + i + "][" + j + "] = ");
//				arr[i][j] = in.nextInt();
				
				arr[i][j] = rng.nextInt(RNG);
				
				sumCol[j] += arr[i][j];
				sumRow[i] += arr[i][j];
				
				if (maxColSum < sumCol[j]) {
					maxColSum = sumCol[j];
					maxColSumIdx = j;
				}
				
				if (maxRowSum < sumRow[i]) {
					maxRowSum = sumRow[i];
					maxRowSumIdx = i;
				}
				
				if (i > 0 && j > 0)
					if (arr[i][j] > arr[maxPos[0]][maxPos[1]])
						maxPos = new int[] { i, j };
			}
		}
		
		
		System.out.println("\nMatrica: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("   Σ=" + sumRow[i]);
		}
		
		for (int j = 0; j < m; j++)
			System.out.print("Σ=" + sumCol[j] + "\t");
		
		System.out.println("\n");
		
		
		System.out.println("Maksimalni element je  : " + arr[maxPos[0]][maxPos[1]]);
		System.out.println("Maksimum je na poziciji: (" + maxPos[0] + ", " + maxPos[1] + ")");
		
		
		System.out.println("Maksimum zbirova vrsta : " + maxRowSum + ", vrsta : " + maxRowSumIdx);
		System.out.println("Maksimum zbirova kolona: " + maxColSum + ", kolona : " + maxColSumIdx + "\n");
		

		System.out.print("Unesite vrednost za pretragu: ");
		int num = in.nextInt();
		
		int[] src = null;
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (arr[i][j] == num)
					src = new int[] { i, j };
		
		if (src == null) 
			System.out.println("Trazeni broj se ne nalazi u matrici.");
		else 
			System.out.println("Poslednja pojava broja : (" + src[0] + ", " + src[1] + ")");
		
		
		for (int i = 0; i < n; i++) {
			for (int j = arr[0].length - 1; j > 0; j--) {
				
				boolean exchangeOccurred = false;
				
				for (int k = 0; k < j; k++)
					if (arr[i][k] > arr[i][k + 1]) {
						int tmp = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = tmp;
						
						exchangeOccurred = true;
					}
				
				if (!exchangeOccurred) break;
			}
		}

		
		System.out.println("\nMatrica sa sortiranim vrstama (rastuce): ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("   Σ=" + sumRow[i]);
		}
		
		for (int j = 0; j < m; j++)
			System.out.print("Σ=" + sumCol[j] + "\t");
		
		System.out.println("\n");
		
		System.out.print("Pretraga, donja gr.    : ");
		int l = in.nextInt();

		System.out.print("Pretraga, gornja gr.   : ");
		int h = in.nextInt();
		
		if (l > h) {
			int t = l;
			l = h;
			h = t;
		}
		
		int[][] res = new int[n * m][2];
		int idx = 0;
		

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (l <= arr[i][j] && arr[i][j] <= h)
					res[idx++] = new int[] { i, j };
		
		System.out.println("Rezultati pretrage     : ");
		for (int i = 0; i < idx; i++)
			System.out.println("\tarr[" + res[i][0] + "][" + res[i][1] + "] : " + arr[res[i][0]][res[i][1]]);
		
		
		in.close();
	}
}
