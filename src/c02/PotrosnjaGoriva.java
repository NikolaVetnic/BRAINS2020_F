package c02;

public class PotrosnjaGoriva {
	
	private static final double JEDINICA_RAZDALJINE = 100;
	
	public static void main(String[] args) {
		
		double distanca = 350;
		double gorivo = 17;
		
		System.out.println("Prosecna potrosnja goriva je: " + (gorivo / distanca * JEDINICA_RAZDALJINE));
	}
}
