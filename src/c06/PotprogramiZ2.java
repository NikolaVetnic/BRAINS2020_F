package c06;

import java.util.Scanner;

public class PotprogramiZ2 {
	

	public static final int MAX_LEN = 30;
	
	
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) sum += arr[i];
		return sum;
	}
	
	
	public static double avg(int[] arr) {
		return 1.0 * sum(arr) / arr.length;
	}
	
	
	public static int[] xtr(int[] arr) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			min = min < arr[i] ? min : arr[i];
			max = max > arr[i] ? max : arr[i];
		}
		
		return new int[] { min, max };
	}
	
	
	public static int getChoice(Scanner in) {
		
		System.out.println();
		
		System.out.println("Odaberite opciju: ");
		System.out.println("[0] Suma elemenata niza");
		System.out.println("[1] Srednja vrednost niza");
		System.out.println("[2] Stampa ekstremnih vrednosti");
		System.out.print  ("Izbor -> ");
		int ch = in.nextInt();
		
		return ch;
	}
	
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("Unesite broj elemenata niza: ");
			n = in.nextInt();
			
			if (n <= 0 || MAX_LEN < n) System.out.println("Greska!");
		} while (n <= 0 || MAX_LEN < n);
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = in.nextInt();
		}

		boolean run = true;
		
		while (run) {
			
			int ch = getChoice(in);
			
			switch (ch) {
				case 0: System.out.println("Suma elemenata      : " + sum(arr)); break;
				case 1: System.out.println("Srednja vrednost    : " + avg(arr)); break;
				case 2: int[] xtr = xtr(arr);
						System.out.println("Ekstremne vrednosti : " + xtr[0] + ", " + xtr[1]); 
																				 break;
				default: System.out.println("Nepodrzana opcija!");
			}
			
			System.out.println();
		
			System.out.print("Ponoviti? [D]a / Ne (bilo koji unos) -> ");
			String kraj = in.next();
			
			if (!("" + kraj.charAt(0)).toLowerCase().equals("d")) run = false;
		} 
	}
}
