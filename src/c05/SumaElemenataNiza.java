package c05;

import java.util.ArrayList;
import java.util.Scanner;

public class SumaElemenataNiza {
	
	public static final int MAX_LEN = 50;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("Unesite broj elemenata niza: ");
			n = in.nextInt();
			
			if (n <= 0 || MAX_LEN < n) System.out.println("Greska!");
		} while (n <= 0 || MAX_LEN < n);
		
		int[] 	arr = new int[n];
		int 	sum = 0;
		
		ArrayList<Integer> max = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			int num;
			do {
				System.out.print("Element #" + i + ": ");
				num = in.nextInt();
			} while (n < 0);
			
			arr[i]   = num;
			sum 	+= num;
			
			if (max.isEmpty()) {
				
				max.add(i);
			} else {
				
				if (num < arr[max.get(0)])
					continue;
				
				if (num > arr[max.get(0)])
					max.clear();
				
				max.add(i);
			}
		}
		
		System.out.println("Suma elemenata niza: " + sum);
		System.out.println("Maksimalni element: " + arr[max.get(0)]);
		System.out.println("Maksimalni element se nalazi na indeksima: " + max);
		
		in.close();
	}
}
