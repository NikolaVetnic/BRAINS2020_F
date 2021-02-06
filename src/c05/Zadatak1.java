package c05;

import java.util.Scanner;

public class Zadatak1 {


	/*
	 * Dat je niz X od maksimalno 12 celobrojnih elemenata. Treba ucit-
	 * ati n elemenata u niz X i formirati nizove A i B, pri cemu su e-
	 * lementi niza A parni elementi niza X, a elementi niza B su nepa-
	 * rni elementi niza X.
	 */
	
	
	public static final int MAX_LEN = 12;
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = -1;
		do {
			System.out.print("Duzina: ");
			n = in.nextInt();
			
			if (n <= 0 || MAX_LEN < n) System.out.println("Greska!");
		} while (n <= 0 || MAX_LEN < n);
		
		int[] arr = new int[n];
		
		int[] arrOdd = new int[n];
		int cntOdd = 0;
		
		int[] arrEvn = new int[n];
		int cntEvn = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = in.nextInt();
			
			if ((arr[i] & 1) == 0)
				arrEvn[cntEvn++] = arr[i];
			else
				arrOdd[cntOdd++] = arr[i];
		}
		
		System.out.print("Parni elementi : ");
		for (int i = 0; i < cntEvn; i++)
			System.out.print(arrEvn[i] + " ");
		System.out.println();
		
		System.out.print("Neparni elementi : ");
		for (int i = 0; i < cntOdd; i++)
			System.out.print(arrOdd[i] + " ");
		System.out.println();
		
		in.close();
	}
}
