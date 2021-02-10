package c07;

import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
	

	/*
	 * =-=-= Program za pracenje poslovanja agenta za osiguranje =-=-=
	 * 
	 * Evidencija prodaje osiguranja orgranizovana je u 5 kategorija, i
	 * belezi se za svaki dan u mesecu (pretpostaviti da ih je 30).
	 * 
	 * Program treba da omoguci:
	 * 1) Unos ostvarenog prihoda za zadatu kategoriju osiguranja i dan
	 *    u mesecu.
	 * 2) Izmenu ostvarenog prihoda za zadatu kategoriju osiguranja ka-
	 *    o i dan u mesecu.
	 * 3) Prikaz rezultata sortiran po kategorijama osiguranja za izab-
	 *    rani dan u mesecu.
	 * 4) Prikaz rezultata sortiran po danima u mesecu za izabranu kat-
	 *    egoriju.
	 * 5) Izračunavanje i prikaz dana kad je ostvaren najmanji prihod i
	 *    koliko on iznosi.
	 * 6) Izračunavanje i prikaz ukupnog mesečnog prihod za svaku kate-
	 *    goriju osiguranja.
	 * 7) Izračunavanje i prikaz prosečnog mesečnog prihoda.
	 * 8) Meni iz kojeg se biraju ponuđene funkcije.
	 * 9) Obavezno koristiti funkcije za implementaciju traženih funkc-
	 *    ionalnosti.
	 * A) Izabrati korektne tipove podataka i strukture podataka i ogr-
	 *    aničiti unos tako da nije moguće uneti neispravne vrednosti.
	 */
	
	
	static final int BR_DANA = 30;
	static final int BR_KAT = 5;
	
	
	static Random rng = new Random();
	
	
	static double[][] m = new double[BR_DANA][BR_KAT];
	
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int choice;
		
		do {
			choice = getChoice(in);
			
			switch (choice) {
				case 1: unosPrihoda(in);					break;
				case 2: autoUnosPrihoda();					break;
				case 3: unosPrihodaNaPoziciji(in);			break;
				case 4: prikaziSortiraneKategorije(in);		break;
				case 5: prikaziSortiraneDane(in);			break;
				case 6: prikaziNajmanjuZaradu();			break;
				case 7: prikaziMesecniPrihod();				break;
				case 8: prikaziMesecniProsek();				break;
				case 9: stampaj();							break;
				case 0: System.out.println("Dovidjenja!");	break;
				
				default: System.out.println("Nepodrzana opcija!");
			}
		} while (1 <= choice && choice <= 9);
		
		in.close();
	}


	private static void prikaziMesecniProsek() {
		
		double sum = 0.0;
		
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				sum += m[i][j];
		
		System.out.println("Prosecni mesecni prihod : " + (sum / (BR_DANA)));
	}


	private static int getChoice(Scanner in) {
		
		System.out.println(" =-=-= ZADATAK_1 =-=-= \n");
		System.out.println("[1] Unos ostvarenog prihoda po kategorijama i danima");
		System.out.println("[2] Automatsko popunjavanje tabele");
		System.out.println("[3] Izmena vrednosti za zadati dan i kategoriju");
		System.out.println("[4] Prikaz rezultata sortiran po kategorijama osiguranja za izabrani dan u mesecu");
		System.out.println("[5] Prikaz rezultata sortiran po danima u mesecu za izabranu kategoriju");
		System.out.println("[6] Izracunavanje i prikaz dana kad je ostvaren najmanji prihod");
		System.out.println("[7] Izracunavanje i prikaz ukupnog mesecnog prihod za svaku kategoriju osiguranja");
		System.out.println("[8] Izracunavanje i prikaz prosečnog mesecnog prihoda");
		System.out.println("[9] Stampaj tabelu\n");
		
		System.out.println("[0] Izlaz\n");
		
		System.out.print("Izbor --> ");
		int choice = in.nextInt();
		
		System.out.println();
		
		return choice;
	}


	private static void prikaziMesecniPrihod() {
		
		double[] mesecniPrihodi = new double[BR_KAT];
		
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				mesecniPrihodi[j] += m[i][j];
		
		// stampanje
		
		System.out.println("Mesecni prihodi po kategorijama : ");
		for (int i = 0; i < mesecniPrihodi.length; i++)
			System.out.printf("[ Kat %d ] %10.2f \n", i, mesecniPrihodi[i]);
	}


	private static void prikaziNajmanjuZaradu() {
		
		double min = Double.MAX_VALUE;
		int[] pos = new int[2];
		
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				if (m[i][j] < min) {
					min = m[i][j];
					pos[0] = i;
					pos[1] = j;
				}
		
		System.out.printf("Najmanji prihod : %6.2f (dan : %2d, kat : %2d) \n", min, pos[0], pos[1]);
	}


	private static void prikaziSortiraneDane(Scanner in) {
		
		// selekcija kategorije i uzimanje vrednosti
		
		System.out.print("Kat : ");
		int kat = in.nextInt();
		
		int[] idx = new int[BR_DANA];
		double[] prihodi = new double[BR_DANA];
		
		for (int i = 0; i < BR_DANA; i++) {
			idx[i] = i;
			prihodi[i] = m[i][kat];
		}
		
		// selection sort
		
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
		
		// stampa
		
		System.out.print("        ");
		System.out.printf("[ %6s ]", ("Kat " + kat));
		
		for (int i = 0; i < BR_DANA; i++) {
			
			System.out.printf("Dan %2d    ", i);
			System.out.printf("%8.2f  \n", prihodi[i]);
		}
	}


	private static void prikaziSortiraneKategorije(Scanner in) {

		// selekcija dana i uzimanje vrednosti
		
		System.out.print("Dan : ");
		int dan = in.nextInt();
		
		int[] idx = new int[BR_KAT];
		double[] prihodi = new double[BR_KAT];
		
		for (int j = 0; j < BR_KAT; j++) {
			idx[j] = j;
			prihodi[j] = m[dan][j];
		}
		
		// selection sort
		
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
		
		// stampanje
		
		System.out.print("        ");
		
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("[ %6s ]", ("Kat " + idx[j]));
		
		System.out.println();
		
		System.out.printf("Dan %2d    ", dan);
		
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("%8.2f  ", prihodi[j]);
		
		System.out.println();
	}


	private static void unosPrihodaNaPoziciji(Scanner in) {
		
		System.out.print("Dan : ");
		int i = in.nextInt();
		
		System.out.print("Kat : ");
		int j = in.nextInt();
		
		System.out.println("Dan[" + i + "] Kat[" + j + "] : ");
		m[i][j] = in.nextDouble();
	}


	private static void stampaj() {
		
		System.out.print("        ");
		
		for (int j = 0; j < m[0].length; j++)
			System.out.printf("[ %6s ]", ("Kat " + j));
		
		System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			
			System.out.printf("Dan %2d    ", i);
			
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%8.2f  ", m[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}


	private static void autoUnosPrihoda() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = rng.nextDouble() * 1E5;
			}
		}
	}


	private static void unosPrihoda(Scanner in) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print("Dan[" + i + "] Kat[" + j + "] : ");
				m[i][j] = in.nextDouble();
			}
		}
	}
}
