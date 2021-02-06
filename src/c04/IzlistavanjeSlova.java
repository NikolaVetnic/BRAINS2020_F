package c04;

import java.util.Scanner;

public class IzlistavanjeSlova {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Unesite jedan red teskta:");
		String line = in.nextLine();
			   line = line.toUpperCase();
		
		System.out.println("Vas red teksta sadrzi sledeca slova:\n");
		
		int currLetter = 0;
		int diffLetter = 0;
		
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			
			currLetter = 0;
			
			for (int i = 0; i < line.length(); i++)
				if (letter == line.charAt(i))
					currLetter++;
			
			if (currLetter != 0) {
				System.out.println("Slovo " + letter + " se pojavljuje puta: " + currLetter);
				diffLetter++;
			}
		}
		
		System.out.println("Razlicith slova ima: " + diffLetter);
			
		in.close();
	}
}
