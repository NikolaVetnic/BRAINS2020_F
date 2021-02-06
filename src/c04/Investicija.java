package c04;

import java.util.Scanner;

public class Investicija {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int MAXELNIZA = 50; // final sluzi da oznaci vrednost koja se vise ne moze menjati
		int N = 1, i, suma = 0;
		
		int NizPrirordnihBrojeva[] = new int[MAXELNIZA];
		
		System.out.println("Program za racunanje sume elemenata niza N prirodnih brojeva.");
		System.out.print("Unesite N:\t"); // prihvati broi elemenata niza
		
		N = in.nextInt();
		for (i = 0; i < N; i++){ // prihvati elemente niza od korisnika
			System.out.println("Unesite " + (i+1) + ". element niza:\t");
			NizPrirordnihBrojeva[ i ] = in.nextInt();
			suma += NizPrirordnihBrojeva[ i ];
		}

		System.out.println("Suma elemenata niza izosi " + suma + ".");
		
		in.close();
	}
}
