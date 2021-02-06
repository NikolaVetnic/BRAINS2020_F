package c03;

public class Branchless {

	public static void main(String[] args) {
		
		int a = 4, 
			b = 3;
		
		System.out.println((a > b ? 1 : 0) * a + (b > a ? 1 : 0) * b);
	}
}
