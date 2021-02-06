package c05;

import java.util.Scanner;

public class Zadatak4 {
	
	
	/*
	 * Dat je niz C od maksimalno 15 karaktera. Treba ucitati n karakt-
	 * era u niz C i formirati niz A, pri cemu vazi da su elementi niza
	 * A samo brojevi iz niza C.
	 */
	
	
	public static final int MAX_LEN = 15;
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = -1;
		do {
			System.out.print("Duzina: ");
			n = in.nextInt();
			
			if (n <= 0 || MAX_LEN < n) System.out.println("Greska!");
		} while (n <= 0 || MAX_LEN < n);
		
		char[] arr = new char[n];
		
		char[] num = new char[n];
		int numCnt = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = in.next().charAt(0);
			
			if ('0' <= arr[i] && arr[i] <= '9')
				num[numCnt++] = arr[i];
		}
		
		System.out.print("Elementi niza karaktera koji su brojevi: ");
		for (int i = 0; i < numCnt; i++)
			System.out.print(num[i] + " ");
		System.out.println();
		
		in.close();
	}
}
