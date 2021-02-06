package c05;

import java.util.Scanner;

public class Zadatak3 {
	
	
	/*
	 * Dat je niz A od maksimalno 20 celobrojnih elemenata. Treba ucit-
	 * ati n elemenata, zatim ucitati ceo broj br. Na izlazu treba isp-
	 * isati ceo niz i broj pojavljivanja broja br u nizu.
	 */
	
	
	public static final int MAX_LEN = 20;
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = -1;
		do {
			System.out.print("Duzina: ");
			n = in.nextInt();
			
			if (n <= 0 || MAX_LEN < n) System.out.println("Greska!");
		} while (n <= 0 || MAX_LEN < n);
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = in.nextInt();
		}
		
		System.out.print("Unesite broj za pretragu: ");
		int num = in.nextInt();
		
		int count = 0;
		for (int i : arr)
			count = i == num ? count + 1 : count;
		
		System.out.println("Trazeni broj se pojavljuje puta: " + count);
		
		in.close();
	}
}
