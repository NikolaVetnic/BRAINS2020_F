package c06;

import java.util.Scanner;

public class PotprogramiZ4 {

	
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
	
	
	private static String[][] sortiraj(String[][] polaznici, int kriterijum) {
		
		for (int i = polaznici.length - 1; i > 0; i--) {
			
			boolean exchOccurred = false;
			
			for (int j = 0; j < i; j++)
				if (polaznici[j][kriterijum].compareTo(polaznici[j + 1][kriterijum]) >= 0) {
					polaznici = zameni(polaznici, j, j + 1);
					exchOccurred = true;
				}
			
			if (!exchOccurred) break;
		}
		
		return polaznici;
	}
	
	
	private static String[][] zameni(String[][] arr, int i, int j) {
		
		String[] tmp = { arr[i][0], arr[i][1], arr[i][2], arr[i][3] };
		arr[i] = new String[] { arr[j][0], arr[j][1], arr[j][2], arr[j][3] };
		arr[j] = new String[] { tmp[0], tmp[1], tmp[2], tmp[3] };
		
		return arr;
	}
	
	
	private static int getChoice(Scanner in) {
		
		int ch;
		
		do {
			System.out.println("Odaberite opciju: ");
			System.out.println("[0] Sortiranje po JMBGu");
			System.out.println("[1] Sortiranje po imenu");
			System.out.println("[2] Sortiranje po prezimenu");
			System.out.println("[3] Sortiranje po gradu");
			
			System.out.print  ("Izbor -> ");
			ch = in.nextInt();
			
			if (!(0 <= ch && ch <= 3)) System.out.println("Greska!");
		} while (!(0 <= ch && ch <= 3));
		
		System.out.println();
		
		return ch;
	}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[][] polaznici = unosPolaznika(in);
		
		boolean run = true;
		
		while (run) {
		
			int ch = getChoice(in);
			
			polaznici = sortiraj(polaznici, ch);
			stampaj(polaznici);
			
			System.out.println();
			
			System.out.print("Ponoviti? [D]a / Ne (bilo koji unos) -> ");
			String kraj = in.next();
			
			System.out.println();
			
			if (!("" + kraj.charAt(0)).toLowerCase().equals("d")) run = false;
		};
		
		in.close();
	}
}
