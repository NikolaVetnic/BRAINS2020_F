package c07;

import java.util.Random;
import java.util.Scanner;

public class DomaciZadatak3 {

	/*
	 * =-=-=-=  Program za praćenje godišnjeg poslovanja banke  =-=-=-=
	 * 
	 * Banka posluje u gradu putem 10 poslovnica i za svaki mesec bele-
	 * zi se njen prihod. Program treba da omoguci: 
	 * 1) Unos ostvarenog prihoda za zadatu poslovnicu i mesec. 
	 * 2) Izmenu ostvarenog prihoda za zadatu poslovnicu i mesec.
	 * 3) Prikaz mesecnih prihoda za izabranu poslovnicu.
	 * 4) Prikaz prihoda pojedinacnih poslovnica za izabrani mesec.
	 * 5) Izracunavanje i prikaz meseca u kojem je ukupni prihod najve-
	 *    ci i koliko on iznosi.
	 * 6) Izracunavanje i prikaz ukupnog godisnjeg prihoda.
	 * 7) Izracunavanje i prikaz prosecnog prihoda za svaku poslovnicu.
	 * 8) Meni iz kojeg se biraju ponudjene funkcije.
	 * 
	 * Obavezno koristiti funkcije za implementaciju trazenih funkcion-
	 * alnosti. Izabrati korektne tipove podataka i strukture podataka,
	 * i ograničiti unos tako da nije moguce uneti neispravne vrednost-
	 * i.
	 */
	
	
	/*******************
	 *                 *
	 *  NIKOLA VETNIC  *
	 *                 *
	 *******************/
	
	
	static private final int BR_POSLOVNICA = 10;
	static private final int BR_MESECI = 12;
	
	
	static Random rng = new Random();
	
	
	static private final String[] mes = {
			"jan", "feb", "mar", "apr", "maj", "jun", "jul", "avg", "sep", "okt", "nov", "dec"
	};
	
	
	static private double[][] m = new double[BR_MESECI][BR_POSLOVNICA];
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int choice;
		
		do {
			choice = getChoice(in);
			
			switch (choice) {
				case 1: unosPrihoda(in);					break;
				case 2: autoUnosPrihoda();					break;
				case 3: unosPrihodaNaPoziciji(in);			break;
				case 4: prikaziVrstu(in);					break;
				case 5: prikaziKolonu(in);					break;
				case 6: prikaziMesecSaMaxZaradom();			break;
				case 7: prikaziGodisnjiPrihod();			break;
				case 8: prikaziProsecniPrihod();			break;
				case 9: stampaj();							break;
				case 0: System.out.println("Dovidjenja!");	break;
				
				default: System.out.println("Nepodrzana opcija!");
			}
		} while (1 <= choice && choice <= 9);
		
		in.close();
	}


	private static int preuzmiVrednost(Scanner in, String poruka, int min, int max) {
		
		int out;
		do {
			System.out.print(poruka);
			out = in.nextInt();
			
			if (!(min <= out && out <= max)) System.out.println("Greska! Vrednost van opsega [" + min + ", " + max + "]...");
			
		} while (!(min <= out && out <= max));
		
		return out;
	}
	
	
	private static double preuzmiPrihod(Scanner in, String poruka) {
		
		double out;
		do {
			System.out.print(poruka);
			out = in.nextInt();
			
			if (out < 0) System.out.println("Prihod ne sme biti negativan!");
			
		} while (out < 0);
		
		return out;
	}
	
	
	private static boolean preuzmiBoolean(Scanner in, String poruka) {
		
		System.out.print(poruka);
		int out = in.nextInt();
		
		return out == 0 ? false : true;
	}


	private static int getChoice(Scanner in) {
		
		System.out.println(" =-=-= ZADATAK_1 =-=-= \n");
		System.out.println("[1] Unos ostvarenog prihoda za zadatu poslovnicu i mesec");
		System.out.println("[2] Automatsko popunjavanje tabele");
		System.out.println("[3] Izmena ostvarenog prihoda za zadatu poslovnicu i mesec");
		System.out.println("[4] Prikaz mesečnih prihoda za izabranu poslovnicu");
		System.out.println("[5] Prikaz prihoda pojedinacnih poslovnica za izabrani mesec");
		System.out.println("[6] Izracunavanje i prikaz meseca u kojem je ukupni prihod najveci i koliko on iznosi");
		System.out.println("[7] Izracunavanje i prikaz ukupnog godisnjeg prihoda");
		System.out.println("[8] Izracunavanje i prikaz prosecnog prihoda za svaku poslovnicu");
		System.out.println("[9] Stampaj tabelu\n");
		
		System.out.println("[0] Izlaz\n");
		
		int choice = preuzmiVrednost(in, "Izbor --> ", 0, 9);
		
		System.out.println();
		
		return choice;
	}


	private static void unosPrihoda(Scanner in) {
		
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				m[i][j] = preuzmiPrihod(in, "Dan[" + i + "] Kat[" + j + "] : ");
	}
	
	
	private static void autoUnosPrihoda() {
		
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				m[i][j] = rng.nextDouble() * 1E5;
	}


	private static void unosPrihodaNaPoziciji(Scanner in) {
		
		int i = preuzmiVrednost(in, "Mes : ", 0, BR_MESECI - 1);
		int j = preuzmiVrednost(in, "Pos : ", 0, BR_POSLOVNICA - 1);
		
		m[i][j] = preuzmiPrihod(in, "Mes[" + i + "] Pos[" + j + "] : ");
	}


	private static void prikaziVrstu(Scanner in) {
		
		// selekcija kategorije i uzimanje vrednosti
		
		int pos = preuzmiVrednost(in, "Pos : ", 0, BR_POSLOVNICA - 1);
		
		int[] idx = new int[BR_MESECI];
		double[] prihodi = new double[BR_MESECI];
		
		for (int i = 0; i < BR_MESECI; i++) {
			idx[i] = i;
			prihodi[i] = m[i][pos];
		}
		
		boolean sort = preuzmiBoolean(in, "Sortirati? [0] Ne, [1] Da --> ");
		System.out.println();
		
		// selection sort
		
		if (sort) {
			
			for (int i = idx.length - 1; i > 0; i--) {
				
				int max = 0;
				
				for (int j = 1; j <= i; j++)
					max = prihodi[j] > prihodi[max] ? j : max;
					
				if (max != i) {
					double tmpDbl = prihodi[i];
					prihodi[i] = prihodi[max];
					prihodi[max] = tmpDbl;
					
					int tmpInt = idx[i];
					idx[i] = idx[max];
					idx[max] = tmpInt;
				}
			}
		}
		
		// stampa
		
		System.out.print("        ");
		System.out.printf("[ %6s ]\n", ("Pos " + pos));
		
		for (int i = 0; i < BR_MESECI; i++) {
			
			System.out.printf("[ %-3s ]   ", mes[i].toUpperCase());
			System.out.printf("%8.2f  \n", prihodi[i]);
		}
	}


	private static void prikaziKolonu(Scanner in) {

		// selekcija dana i uzimanje vrednosti
		
		int sel = preuzmiVrednost(in, "Mes : ", 0, BR_MESECI - 1);
		
		int[] idx = new int[BR_POSLOVNICA];
		double[] prihodi = new double[BR_POSLOVNICA];
		
		for (int j = 0; j < BR_POSLOVNICA; j++) {
			idx[j] = j;
			prihodi[j] = m[sel][j];
		}
		
		boolean sort = preuzmiBoolean(in, "Sortirati? [0] Ne, [1] Da --> ");
		System.out.println();
		
		// selection sort
		
		if (sort) {
		
			for (int i = idx.length - 1; i > 0; i--) {
				
				int max = 0;
				
				for (int j = 1; j <= i; j++)
					max = prihodi[j] > prihodi[max] ? j : max;
					
				if (max != i) {
					double tmpDbl = prihodi[i];
					prihodi[i] = prihodi[max];
					prihodi[max] = tmpDbl;
					
					int tmpInt = idx[i];
					idx[i] = idx[max];
					idx[max] = tmpInt;
				}
			}
		}
		
		// stampanje
		
		System.out.print("        ");
		
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("[ %6s ]", ("Pos " + idx[j]));
		
		System.out.println();
		
		System.out.printf("[ %-3s ]   ", mes[sel].toUpperCase());
		
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("%8.2f  ", prihodi[j]);
		
		System.out.println();
	}


	private static void prikaziMesecSaMaxZaradom() {
		
		double max = 0.0;
		int idx = -1;
		
		for (int i = 0; i < BR_MESECI; i++) {
			
			double tmp = 0.0;
			
			for (int j = 0; j < BR_POSLOVNICA; j++) tmp += m[i][j];
			
			if (tmp > max) {
				max = tmp;
				idx = i;
			}
		}
		
		System.out.printf("Maksimalni prihod : %8.2f [ %s ] \n", max, mes[idx].toUpperCase());
	}


	private static void prikaziGodisnjiPrihod() {
		
		double sum = 0.0;
		
		for (int i = 0; i < BR_MESECI; i++)
			for (int j = 0; j < BR_POSLOVNICA; j++)
				sum += m[i][j];
		
		System.out.printf("Godisnji prihod : %8.2f \n", sum);
	}


	private static void prikaziProsecniPrihod() {
		
		double[] avg = new double[BR_POSLOVNICA];
		
		for (int i = 0; i < BR_MESECI; i++)
			for (int j = 0; j < BR_POSLOVNICA; j++)
				avg[j] += m[i][j];
		
		// stampanje
		
		System.out.print("        ");
		
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("[ %6s ]", ("Pos " + j));
		
		System.out.println();
		
		System.out.printf("[ AVG ]   ");
		
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("%8.2f  ", avg[j] / BR_MESECI);
		
		System.out.println();
	}


	private static void stampaj() {

		
		System.out.print("        ");
		
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("[ %6s ]", ("Pos " + j));
		
		System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			
			System.out.printf("[ %-3s ]   ", mes[i].toUpperCase());
			
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%8.2f  ", m[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
