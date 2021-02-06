package c04;

import java.util.Scanner;

public class DeljivoSaSedam {

	public static final int MIN_STUDENATA = 0;
	public static final int MAX_STUDENATA = 160;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = 0,
			count = 0;
		
		do {
			System.out.print("Unesite broj: ");
			n = in.nextInt();
			
			if (n % 7 == 0) count++;
		} while (6 <= n && n <= 142);
		
		System.out.println("Broj unetih koji su deljivi sa 7: " + count);
		
		in.close();
	}
}
