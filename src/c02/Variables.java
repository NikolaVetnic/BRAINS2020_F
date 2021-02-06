package c02;

public class Variables {

	public static void main(String[] args) {
		
		int a = 3;
		int b;
		
		System.out.println("Vrednost promenljive a je: ");
		System.out.println(a);
		
		b = a + 12;
		
		System.out.println("Vrednost promenljive 'b = a + 12' je: ");
		System.out.println(b);
		
		a = a + 2;
		
		System.out.println("Vrednost promenljive 'a = a + 2' je: ");
		System.out.println(a);
		
		b = a + b;
		
		System.out.println("Vrednost promenljive 'b = a + b' je: ");
		System.out.println(b);
	}
}
