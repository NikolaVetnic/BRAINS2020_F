package c03;

public class StringZadatak {

	public static void main(String[] args) {
		
		String s1 = "Prva";
		String s2 = "Druga";
		String s3 = "Treca";
		
		System.out.println("Broj slova u svakoj od reci: " + s1.length() + ", " + s2.length() + ", " + s3.length());
		
		String ss = s1 + " " + s2 + " " + s3;
		System.out.println("Spojeno: " + ss);
		
		System.out.println("Velikim slovima: " + ss.toUpperCase());
	}
}
