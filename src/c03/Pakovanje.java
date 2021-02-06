package c03;

import java.util.Scanner;

public class Pakovanje {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Pakujemo stringove!");
		String o = "";
		String s = "";
		
		do {
			System.out.print("Unesite string: ");
			s = in.nextLine();
			o = s.equals("izlaz") ? o : o + s + " ";
		} while (!s.equals("izlaz"));
		
		System.out.println("Napakovan string: " + o);
		
		in.close();
	}
}
