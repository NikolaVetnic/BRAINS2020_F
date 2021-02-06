package c03;

import java.util.Scanner;

public class BrojSlova {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		String s = in.nextLine();
		
		System.out.println("Duzina stringa: " + s.length());
		
		in.close();
	}
}
