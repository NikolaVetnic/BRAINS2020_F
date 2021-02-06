package c04;

import java.util.Scanner;

public class IfSelekcijaPrimer {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite ocenu: ");
		int ocena = in.nextInt();
		
		if (ocena <  1)
			System.out.println("Ispod opsega!");
		if (ocena == 1)
			System.out.println("Nedovoljan!");
		else if (ocena == 2)
			System.out.println("Dovoljan!");
		else if (ocena == 3)
			System.out.println("Dobar!");
		else if (ocena == 4)
			System.out.println("Vrlo dobar!");
		else if (ocena == 5)
			System.out.println("Odlican!");
		else
			System.out.println("Iznad opsega!");
		
		in.close();
	}
}
