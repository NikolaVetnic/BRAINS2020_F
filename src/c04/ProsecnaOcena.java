package c04;

import java.util.Scanner;

public class ProsecnaOcena {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		double sum = .0;
		double o = .0;
		
		do {
			System.out.print("Unesite ocenu: ");
			o = in.nextDouble();
			sum += o;
			count++;
		} while (o > .0);
		
		System.out.println("Prosecna ocena: " + (sum / count));
		
		in.close();
	}
}
