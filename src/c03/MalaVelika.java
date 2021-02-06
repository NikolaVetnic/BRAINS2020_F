package c03;

import java.util.Scanner;

public class MalaVelika {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		String s = in.nextLine();
		
		String o = "";
		for (int i = 0; i < s.length(); i++)
			o += 'A' <= s.charAt(i) && s.charAt(i) <= 'Z' ? (char) (s.charAt(i) + 32) : s.charAt(i);
			
		System.out.println(o);
		
		in.close();
	}
}
