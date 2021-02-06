package c01;

public class ArithmeticShift {

	public static void main(String[] args) {
		
		int a = 5,
			b = 6,
			c = 7;
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int tmp = a;
		a = b;
		b = c;
		c = tmp;
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = " + a + ", b = " + b);
	}
}
