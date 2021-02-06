package c05;

import java.util.ArrayList;
import java.util.Scanner;

public class SumaElemenataNizaBezAL {
	
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
		
		int[] maxArr = new int[n];
		int maxCnt = 0;
		
		for (int i = 0; i < n; i++) {
			
			int num;
			do {
				System.out.print("Element #" + i + ": ");
				num = in.nextInt();
			} while (n < 0);
			
			arr[i]   = num;
			sum 	+= num;
			
			if (maxCnt == 0) {
				
				maxArr[maxCnt++] = i;
			} else {
				
				if (num < arr[maxArr[0]])
					continue;
				
				if (num > arr[maxArr[0]])
					maxCnt = 0;
				
				maxArr[maxCnt++] = i;
			}
		}
		
		System.out.println("Suma elemenata niza: " + sum);
		System.out.println("Maksimalni element: " + arr[maxArr[0]]);
		
		System.out.print("Maksimalni element se nalazi na indeksima: ");
		for (int i = 0; i < maxCnt; i++) System.out.print(maxArr[i] + " ");
		System.out.println();
		
		in.close();
	}
}
