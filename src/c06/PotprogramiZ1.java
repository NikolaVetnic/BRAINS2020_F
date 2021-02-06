package c06;

import java.util.Scanner;

public class PotprogramiZ1 {
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static double dif(double a, double b) {
		return a - b;
	}
	
	public static double mul(double a, double b) {
		return a * b;
	}
	
	public static double div(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		boolean run = true;
		
		while (run) {
		
			System.out.print("Prvi broj : ");
			double a = in.nextDouble();
			
			System.out.print("Drugi broj : ");
			double b = in.nextDouble();
			
			System.out.print("Operacija : ");
			char c = in.next().charAt(0);
			
			System.out.print("Rezultat: ");
			switch (c) {
				case '+': System.out.println(sum(a, b)); break;
				case '-': System.out.println(dif(a, b)); break;
				case '*': System.out.println(mul(a, b)); break;
				case '/': System.out.println(div(a, b)); break;
				default : System.out.println("Nepodrzana operacija!");
			}
			
			System.out.print("Ponoviti? [D]a / Ne (bilo koji unos) -> ");
			String kraj = in.next();
			
			if (!("" + kraj.charAt(0)).toLowerCase().equals("d")) run = false;
		}
		
		in.close();
	}
}
