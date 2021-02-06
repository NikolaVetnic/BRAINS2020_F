package c05;

import java.util.Scanner;

public class Zadatak5 {
	
	
	/*
	 * Dat je niz A od maksimalno 40 celobrojnih elemenata. Treb ucita-
	 * ti n elemenata u niz A i formirati niz X pri cemu su elementi n-
	 * iza X apsolutne vrednosti negativnih elemenata niza A. Koristiti
	 * abs funkciju.
	 */
	
	
	public static final int MAX_LEN = 40;
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = -1;
		do {
			System.out.print("Duzina: ");
			n = in.nextInt();
			
			if (n <= 0 || MAX_LEN < n) System.out.println("Greska!");
		} while (n <= 0 || MAX_LEN < n);
		
		int[] arr = new int[n];
		
		int[] neg = new int[n];
		int negCnt = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = in.nextInt();
			
			if (arr[i] < 0) neg[negCnt++] = Math.abs(arr[i]);
		}
		
		System.out.print("Apsolutne vrednosti negativnih elemenata niza : ");
		for (int i = 0; i < negCnt; i++)
			System.out.print(neg[i] + " ");
		System.out.println();
		
		in.close();
	}
}
