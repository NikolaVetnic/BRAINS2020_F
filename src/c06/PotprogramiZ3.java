package c06;

import java.util.Scanner;

public class PotprogramiZ3 {

	
	/*
	 * Napraviti program koji prihvata podatke o polaznicima (ime, pre-
	 * zime, jmbg, grad), dobijene podatke sortira po jmbg-u i prikazu-
	 * je ih korisniku. Podaci se smeštaju u niz i moze biti maksimalno
	 * 40 polaznika. Implementirati unos, prikaz i sortiranje kao zase-
	 * bne potprograme.
	 */
	
	
	public static final int MAX_LEN = 40;
	
	
	private static String[][] unosPolaznika(Scanner in) {
		
		int n = -1;
		do {
			System.out.print("Broj polaznika: ");
			n = in.nextInt();
			
			if (n <= 0 || MAX_LEN < n) System.out.println("Greska!");
		} while (n <= 0 || MAX_LEN < n);
		
		String[][] polaznici = new String[n][4];
		String[] polja = { "jmbg", "ime", "prezime", "grad" };
		
		for (int i = 0; i < polaznici.length; i++) {
			for (int j = 0; j < polaznici[0].length; j++) {
				System.out.print("Polaznik #" + i + ", unesite " + polja[j] + " : ");
				polaznici[i][j] = in.next();
			}
			System.out.println();
		}
		
		return polaznici;
	}	
	
	
	private static void stampaj(String[][] polaznici) {
		
		for (String[] polaznik : polaznici) {
			for (int j = 0; j < polaznik.length; j++) {
				System.out.print(polaznik[j] + " ");
			}
			
			System.out.println();
		}
	}
	
	
	private static String[][] sortiraj(String[][] polaznici) {
		
		for (int i = polaznici.length - 1; i > 0; i--) {
			
			boolean exchOccurred = false;
			
			for (int j = 0; j < i; j++)
				if (polaznici[j][0].compareTo(polaznici[j + 1][0]) >= 0) {
					polaznici = zameni(polaznici, j, j + 1);
					exchOccurred = true;
				}
			
			if (!exchOccurred) break;
		}
		
		return polaznici;
	}
	
	
	private static String[][] zameni(String[][] arr, int i, int j) {
		
		String[] tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
		return arr;
	}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[][] polaznici = unosPolaznika(in);
		polaznici = sortiraj(polaznici);
		stampaj(polaznici);
		
		in.close();
	}
}
