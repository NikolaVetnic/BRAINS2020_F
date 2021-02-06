package c02;

import java.util.Scanner;

public class Operacije {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Celobrojna promenljiva #1: ");
		int a = sc.nextInt();
		
		System.out.print("Celobrojna promenljiva #2: ");
		int b = sc.nextInt();
		
		System.out.print("Operator (+, -, *, /, %): ");
		char op = sc.next().charAt(0);
		
		switch (op) {
			case '+': 	System.out.println("a + b = " + (a + b)); 	break;
			case '-': 	System.out.println("a - b = " + (a - b)); 	break;
			case '*': 	System.out.println("a * b = " + (a * b)); 	break;
			case '/': 	System.out.println("a / b = " + (a / b)); 	break;
			case '%': 	System.out.println("a % b = " + (a % b)); 	break;
			default:	System.out.println("Greska prilikom unosa operatora!");
		}
		
		sc.close();
	}
}
