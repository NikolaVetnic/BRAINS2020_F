package c05;

import java.util.Scanner;

public class Zadatak2 {
	
	
	/*
	 * Dat je niz X od maksimalno 10 realnih elemenata. Ucitati n elem-
	 * enata u niz X i formirati nizove A i B, pri cemu su elementi ni-
	 * za A elementi niza X sa parnim indeksom, a elementi niza B su e-
	 * lementi niza X sa neparnim indeksom.
	 */
	
	
	public static final int MAX_LEN = 10;
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = -1;
		do {
			System.out.print("Duzina: ");
			n = in.nextInt();
			
			if (n <= 0 || MAX_LEN < n) System.out.println("Greska!");
		} while (n <= 0 || MAX_LEN < n);
		
		double[] arr = new double[n];
		
		double[] evnIdx = new double[n];
		int evnCnt = 0;
		
		double[] oddIdx = new double[n];
		int oddCnt = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = in.nextDouble();
			
			if ((i & 1) == 0)
				evnIdx[evnCnt++] = arr[i];
			else
				oddIdx[oddCnt++] = arr[i];
		}
		
		System.out.print("Elementi niza sa parnim indeksima : ");
		for (int i = 0; i < evnCnt; i++)
			System.out.print(evnIdx[i] + " ");
		System.out.println();
		
		System.out.print("Elementi niza sa neparnim indeksima : ");
		for (int i = 0; i < oddCnt; i++)
			System.out.print(oddIdx[i] + " ");
		System.out.println();
		
		in.close();
	}
}
